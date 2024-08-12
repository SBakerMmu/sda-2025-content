package simpleObserver;

public final class Example {
    public static void run()
    {
        Observer observer = new ConcreteObserver();
        MyClass myClass = new MyClass(observer);
        myClass.myOperation("ABC123");
    }
}
