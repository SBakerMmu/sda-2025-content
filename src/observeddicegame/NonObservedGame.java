package observeddicegame;

import java.util.ArrayList;
import java.util.List;

class NonObservedGame implements Game {
    private static final int HOME = 1;
    private static final int END = 6;
    private int currentPosition = HOME;

    @Override
    public void reset() {
        currentPosition = HOME;
    }

    @Override
    public void setPosition(int position) {
        currentPosition = position;
    }

    @Override
    public void advance(int count)
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
