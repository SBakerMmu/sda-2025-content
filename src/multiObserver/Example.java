package multiObserver;

public final class Example {
    public static void run() {
        MyClass myClass = new MyClass();
        myClass.addObserver(new ConsoleObserver());
        myClass.myOperation("ABC123");
    }
}
