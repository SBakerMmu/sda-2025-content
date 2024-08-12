package simpleObserver;

class ConcreteObserver implements Observer {
    @Override
    public void onOperationCalled(String parameter) {
        System.out.format("myOperation() called with parameter %s\n", parameter);
    }
}
