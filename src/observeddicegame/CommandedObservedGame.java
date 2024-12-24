package observeddicegame;

import java.util.ArrayList;
import java.util.List;

class CommandedObservedGame {
    private static final int HOME = 1;
    private final List<GameObserver> observers = new ArrayList<>();


    private int currentPosition = HOME;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    void reset(){
        currentPosition = HOME;
    }

    void add(GameObserver observer)
    {
        observers.add(observer);
    }

    void remove(GameObserver observer)
    {
        observers.remove(observer);
    }

    void advance(DiceShaker shaker) {
        advance(shaker.shake());
    }

    void advance(int count)
    {
        int newPosition = currentPosition + count;
        currentPosition = (newPosition > 6) ? onOverflow(newPosition) : onUnderflow(newPosition);
    }

    private int onOverflow(int candidatePosition)
    {
        int newPosition = candidatePosition % 6;
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
