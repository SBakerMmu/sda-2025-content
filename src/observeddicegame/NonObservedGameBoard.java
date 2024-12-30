package observeddicegame;

class NonObservedGameBoard implements GameBoard {
    private static final int HOME = 1;
    private static final int END = 6;
    private int currentPosition;

    NonObservedGameBoard() {
        reset();
    }

    @Override
    public void reset() {
        setPosition(HOME);
    }

    @Override
    public void setPosition(int position) {
        currentPosition = position;
    }

    @Override
    public void advance(int count) {
        int newPosition = currentPosition + count;
        currentPosition = newPosition > END ? newPosition % END : newPosition;
    }
}
