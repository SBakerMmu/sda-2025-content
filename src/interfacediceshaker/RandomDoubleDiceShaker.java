package interfacediceshaker;

import java.util.Random;

class RandomDoubleDiceShaker implements DiceShaker{

    private final Random random = new Random();

    @Override
    public int shake() {
        //generate number between 1 an 12
        return random.nextInt(12) + 1;
    }
}
