package multiObserver;

class NullObserver implements Observer {
    @Override
    public void onOperationCalled(String parameter) {
        //do nothing
    }
}
