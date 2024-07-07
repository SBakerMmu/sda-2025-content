package generalstrategy;

public class Example {

    static void RunExample()
    {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.operation(); //will use the provided ConcreteStrategy
    }

}
