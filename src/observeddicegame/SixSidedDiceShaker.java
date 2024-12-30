package observeddicegame;

class SixSidedDiceShaker implements DiceShaker {
    private final int[] shakes = new int[]{ 4,3};
    private int index;

    @Override
    public int shake() {
        //generate number between 1 and 6
        return shakes[index++];
    }
}
