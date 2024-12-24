package abstractdiceshaker;

import java.util.Random;

abstract class AbstractDiceShaker {
    protected final Random random = new Random();
    abstract int shake();
}
