package decorateddiceshaker;

public final class Example {

    public static void run() {
        DiceShakerFactory factory = new SingleDiceShakerFactory();
        show(factory);

        factory = new DoubleDiceShakerFactory();
        show(factory);

        factory = new TripleDiceShakerFactory();
        show(factory);


    }

    private static void show(DiceShakerFactory factory) {
        DiceShaker shaker = new ConsoleWriter(factory.create());
        shaker.shake();
        shaker.shake();
        shaker.shake();
    }


}
