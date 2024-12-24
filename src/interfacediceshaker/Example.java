package interfacediceshaker;

public final class Example {

    public static void run() {
        DiceShaker shaker = new RandomSingleDiceShaker();
        System.out.format("RandomSingleDiceShaker %d%n", shaker.shake());

        shaker = new RandomDoubleDiceShaker();
        System.out.format("RandomDoubleDiceShaker %d%n", shaker.shake());

        shaker = new FixedSingleDiceShaker();
        for(int i = 0; i< 8; i++) {
            System.out.format("FixedSingleDiceShaker %d%n", shaker.shake());
        }
    }

}
