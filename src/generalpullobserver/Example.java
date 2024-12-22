package generalpullobserver;

public final class Example {

    public static void run() {
        Observable observable = new Observable();
        Observer observer = new ConcreteObserver(observable);
        observable.attach(observer);
        observable.update();
        observable.detach(observer);
    }
}
