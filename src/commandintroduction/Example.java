package commandintroduction;

public final class Example {

    public static void run()
    {
        MyClass anInstanceOfMyClass = new MyClass();

        Command command = new AddCommand(anInstanceOfMyClass, 2);
        System.out.printf("value %d%n",anInstanceOfMyClass.getValue());
        command.execute();
        System.out.printf("value %d%n",anInstanceOfMyClass.getValue());
        command.undo();
        System.out.printf("value %d%n",anInstanceOfMyClass.getValue());

    }
}
