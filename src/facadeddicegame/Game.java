package facadeddicegame;

class Game {
    private static final int HOME = 1;
    private static final int END = 6;
    private int currentPosition = HOME;

    boolean isHome() {
        return currentPosition == HOME;
    }

    void advance(int count) {
        int newPosition = currentPosition + count;
        currentPosition = newPosition > END ? newPosition % END : newPosition;
    }
}
