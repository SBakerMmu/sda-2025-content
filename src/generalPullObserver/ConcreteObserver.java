package generalPullObserver;

class ConcreteObserver implements Observer {

    private final ConcreteObservable subject;

    ConcreteObserver(ConcreteObservable subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        //Do something with this.subject
    }
}
