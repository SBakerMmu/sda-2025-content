package dipconcreteexample;

class Basket {

    final RealCreditCardService creditCardService;

    public Basket() {
        this.creditCardService = new RealCreditCardService();
    }

    double getTotal() {
        //Get sum total of goods, tax and delivery
        return 100.0d;
    }

    public void chargeCreditCard(String cardNumber, int expiryYear, int expiryMonth) {
        creditCardService.takePayment(getTotal(), cardNumber, expiryYear, expiryMonth);
    }
}
