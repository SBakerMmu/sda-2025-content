package observeddicegame;

import java.util.ArrayList;
import java.util.List;

class ObservedGameBoard implements GameBoard {
    private static final int HOME = 1;
    private static final int END = 6;
    private int currentPosition;
    private final List<GameBoardObserver> observers = new ArrayList<>();

    ObservedGameBoard() {
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

    void add(GameBoardObserver observer)
    {
        observers.add(observer);
    }

    void detach(GameBoardObserver observer)
    {
        observers.remove(observer);
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
        for(GameBoardObserver observer: observers)
        {
            observer.onEvent(new OverflowEvent(currentPosition, newPosition));
        }
        return newPosition;
    }

    private int onUnderflow(int candidatePosition)
    {
        for(GameBoardObserver observer: observers)
        {
            observer.onEvent(new UnderflowEvent(currentPosition, candidatePosition));
        }
        return candidatePosition;
    }

}
