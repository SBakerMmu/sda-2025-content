package abstractdiceshaker;

import bridgeproduct.*;
import globaltradeitemnumber.*;

public final class Example {

    public static void run() {
        AbstractDiceShaker shaker = new ConcreteSingleDiceShaker();
        System.out.format("ConcreteSingleDiceShaker %d%n", shaker.shake());
        shaker = new ConcreteDoubleDiceShaker();
        System.out.format("ConcreteDoubleDiceShaker %d%n", shaker.shake());

    }

}
