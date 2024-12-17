package generalPushObserver;

public final class Example {

    public static void run() {
        Observer observer = new ConcreteObserver();
        Observable observable = new ConcreteObservable();
        observable.attach(observer);
        observable.update();
    }
}
