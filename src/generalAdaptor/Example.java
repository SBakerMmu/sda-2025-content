package generalAdaptor;

public final class Example {

    public static void run() {
        Adaptee adaptee = new ConcreteAdaptee();
        Adapter adapter = new Adapter(adaptee);
        //ends up calling operation2() on the adaptee interface
        adapter.operation();
    }
}
