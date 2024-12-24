package observeddicegame;

import java.util.ArrayList;
import java.util.List;

class NonObservedGame {
    private static final int HOME = 1;
    private static final int END = 6;
    private int currentPosition = HOME;

    void advance(int count)
    {
        int newPosition = currentPosition + count;
        currentPosition = (newPosition > END) ? onOverflow(newPosition) : onUnderflow(newPosition);
    }

    private int onOverflow(int candidatePosition)
    {
        return candidatePosition % END;
    }

    private int onUnderflow(int candidatePosition)
    {
        return candidatePosition;
    }
}
