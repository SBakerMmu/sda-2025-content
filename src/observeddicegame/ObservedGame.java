package observeddicegame;

import java.util.ArrayList;
import java.util.List;

class ObservedGame  implements Game {
    private static final int HOME = 1;
    private static final int END = 6;
    private int currentPosition;
    private final List<GameObserver> observers = new ArrayList<>();

    ObservedGame() {
        reset();
    }

    @Override
    public void reset()
    {
        currentPosition = HOME;
    }

    void add(GameObserver observer)
    {
        observers.add(observer);
    }

    void detach(GameObserver observer)
    {
        observers.remove(observer);
    }

    @Override
    public void setPosition(int position)
    {
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
        int newPosition = candidatePosition % END;
        for(GameObserver observer: observers)
        {
            observer.onOverflow(new OverflowEvent(currentPosition, newPosition));
        }
        return newPosition;
    }

    private int onUnderflow(int candidatePosition)
    {
        for(GameObserver observer: observers)
        {
            observer.onUnderflow(new UnderflowEvent(currentPosition, candidatePosition));
        }
        return candidatePosition;
    }

}