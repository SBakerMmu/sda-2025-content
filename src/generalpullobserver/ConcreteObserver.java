package generalpullobserver;

class ConcreteObserver implements Observer {

    private final Observable subject;

    ConcreteObserver(Observable subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        //Do something with this.subject
    }
}
