package generalpushobserver;

public final class Example {

    public static void run() {
        Observable observable = new Observable();
        Observer observer = new ConcreteObserver();
        observable.attach(observer);
        observable.update();
    }
}
