package generalpullobserver;

public final class Example {

    public static void run() {
        ConcreteObservable observable = new ConcreteObservable();
        Observer observer = new ConcreteObserver(observable);
        observable.attach(observer);
        observable.update();
        observable.detach(observer);
    }
}
