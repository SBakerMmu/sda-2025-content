package orderstatemachine;

class Order {

    private interface Context {
        int getNumberOrderItems();

        void changeState(State state);

        EmailService getEmailService();

        PaymentService getPaymentService();
    }

    private interface State {
        void paymentConfirmed(Context context);

        void customerCancelled(Context context);

        void warehouseCancelled(Context context);

        void itemPicked(Context context);

        void orderPacked(Context context);

        void courierPickup(Context context);

        void customerReturn(Context context);
    }

    private abstract static class AbstractState implements State {
        @Override
        public void paymentConfirmed(Context context) {
            throw new IllegalStateException();
        }

        @Override
        public void customerCancelled(Context context) {
            throw new IllegalStateException();
        }

        @Override
        public void warehouseCancelled(Context context) {
            throw new IllegalStateException();
        }

        @Override
        public void itemPicked(Context context) {
            throw new IllegalStateException();
        }

        @Override
        public void orderPacked(Context context) {
            throw new IllegalStateException();
        }

        @Override
        public void courierPickup(Context context) {
            throw new IllegalStateException();
        }

        @Override
        public void customerReturn(Context context) {
            throw new IllegalStateException();
        }
    }

    private class Received extends AbstractState {

        @Override
        public String toString() {
            return "Received";
        }


        @Override
        public void paymentConfirmed(Context context) {
            context.getEmailService().sendOrderConfirmation(orderNumber);
            context.changeState(new Paid());
        }

        @Override
        public void customerCancelled(Context context) {
            context.getPaymentService().refundCustomer(orderNumber);
            context.getEmailService().sendCustomerCancellationConfirmationEmail(orderNumber);
        }

    }

    private class Paid extends AbstractState {

        private int itemsToPick = orderItems;

        @Override
        public String toString() {
            return "Paid";
        }

        @Override
        public void itemPicked(Context context) {
            if (--itemsToPick == 0) {
                context.changeState(new Picked());
            }
        }

        @Override
        public void customerCancelled(Context context) {
            itemsToPick = orderItems;
            context.getPaymentService().refundCustomer(orderNumber);
            context.getEmailService().sendCustomerCancellationConfirmationEmail(orderNumber);
            context.changeState(new Cancelled());
        }

        @Override
        public void warehouseCancelled(Context context) {
            itemsToPick = orderItems;
            context.getEmailService().sendWarehouseCancellationApologyEmail(orderNumber);
            context.changeState(new Cancelled());
        }
    }

    private class Picked extends AbstractState {

        @Override
        public String toString() {
            return "Picked";
        }

        @Override
        public void orderPacked(Context context) {
            context.getEmailService().notifyCourier(orderNumber);
            context.changeState(new Packed());
        }

        @Override
        public void warehouseCancelled(Context context) {
            context.getPaymentService().refundCustomer(orderNumber);
            context.getEmailService().sendWarehouseCancellationApologyEmail(orderNumber);
            context.changeState(new Cancelled());
        }

    }

    private class Packed extends AbstractState {

        @Override
        public String toString() {
            return "Packed";
        }

        @Override
        public void courierPickup(Context context) {
            context.getEmailService().sendDispatchConfirmationEmail(orderNumber);
            context.changeState(new Dispatched());
        }

    }


    private class Dispatched extends AbstractState {

        @Override
        public String toString() {
            return "Dispatched";
        }

        @Override
        public void customerReturn(Context context) {
            context.getPaymentService().refundCustomer(orderNumber);
            context.getEmailService().sendReturnConfirmationEmail(orderNumber);
            context.changeState(new Returned());
        }
    }

    private static class Returned extends AbstractState {

        @Override
        public String toString() {
            return "Returned";
        }

        //There are no legal transitions from Returned state, it is the final state
    }

    private static class Cancelled extends AbstractState {

        @Override
        public String toString() {
            return "Cancelled";
        }

        //There are no legal transitions from Cancelled state, it is the final state
    }

    private class StateMachine implements Context {
        private State currentState = new Received();

        @Override
        public int getNumberOrderItems() {
            return orderItems;
        }

        @Override
        public void changeState(State state) {
            currentState = state;
        }

        @Override
        public EmailService getEmailService() {
            return emailService;
        }

        @Override
        public PaymentService getPaymentService() {
            return paymentService;
        }


        String getCurrentState() {
            return currentState.toString();
        }

        void paymentConfirmed() {
            currentState.paymentConfirmed(this);
        }

        void customerCancelled() {
            currentState.customerCancelled(this);
        }

        void warehouseCancelled() {
            currentState.warehouseCancelled(this);
        }

        void itemPicked() {
            currentState.itemPicked(this);
        }

        void orderPacked() {
            currentState.orderPacked(this);
        }

        void courierPickup() {
            currentState.courierPickup(this);
        }

        void customerReturn() {
            currentState.customerReturn(this);
        }
    }

    private final String orderNumber;
    private final int orderItems;
    private final EmailService emailService;
    private final PaymentService paymentService;
    private final StateMachine stateMachine = new StateMachine();

    Order(String orderNumber, int orderItems, EmailService emailService, PaymentService paymentService) {
        this.orderNumber = orderNumber;
        this.orderItems = orderItems;
        this.emailService = emailService;
        this.paymentService = paymentService;
    }

    void paymentConfirmed() {
        stateMachine.paymentConfirmed();
    }

    void customerCancelled() {
        stateMachine.customerCancelled();
    }

    void warehouseCancelled() {
        stateMachine.warehouseCancelled();
    }

    void itemPicked() {
        stateMachine.itemPicked();
    }

    void orderPacked() {
        stateMachine.orderPacked();
    }

    void courierPickup() {
        stateMachine.courierPickup();
    }

    void customerReturn() {
        stateMachine.customerReturn();
    }

    public String getCurrentState() {
        return String.format("%s %s", orderNumber, stateMachine.getCurrentState());
    }
}
