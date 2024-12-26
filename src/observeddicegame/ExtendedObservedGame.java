package observeddicegame;

import java.util.ArrayList;
import java.util.List;

class ExtendedObservedGame implements Game {
    private static final int HOME = 1;
    private static final int END = 6;
    private int currentPosition;
    private final List<ExtendedGameObserver> observers = new ArrayList<>();

    ExtendedObservedGame() {
        reset();
    }

    @Override
    public void reset()
    {
        currentPosition = HOME;
    }

    void add(ExtendedGameObserver observer)
    {
        observers.add(observer);
    }

    void detach(ExtendedGameObserver observer)
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
        OverflowHandler handler = newPosition == HOME ? new HomeOverflowHandler(observers) : new NotHomeOverflowHandler(observers);
        handler.handle(currentPosition, newPosition);
        return newPosition;
    }

    private int onUnderflow(int candidatePosition)
    {
        UnderflowEvent event = new UnderflowEvent(currentPosition, candidatePosition);
        for(ExtendedGameObserver observer: observers)
        {
            observer.onUnderflow(event);
        }
        return candidatePosition;
    }

}
