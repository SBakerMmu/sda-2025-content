package observeddicegame;

import java.util.ArrayList;
import java.util.List;

class ExtendedObservedGameBoard implements GameBoard {

    private static interface Handler {
        void handle(int oldPosition, int newPosition);
    }

    private static class HomeOverflowHandler implements Handler {

        private final List<ExtendedGameBoardObserver> observers;

        public HomeOverflowHandler(List<ExtendedGameBoardObserver> observers) {
            this.observers = observers;
        }

        @Override
        public void handle(int oldPosition, int newPosition) {
            HomeEvent event = new HomeEvent(oldPosition, newPosition);
            for (ExtendedGameBoardObserver observer : observers) {
                observer.onEvent(event);
            }
        }
    }

    private static class NotHomeOverflowHandler implements Handler {

        private final List<ExtendedGameBoardObserver> observers;

        public NotHomeOverflowHandler(List<ExtendedGameBoardObserver> observers) {
            this.observers = observers;
        }

        @Override
        public void handle(int oldPosition, int newPosition) {
            OverflowEvent event = new OverflowEvent(oldPosition, newPosition);
            for(ExtendedGameBoardObserver observer: observers) {
                observer.onEvent(event);
            }
        }
    }

    private static class UnderflowHandler implements Handler {

        private final List<ExtendedGameBoardObserver> observers;

        public UnderflowHandler(List<ExtendedGameBoardObserver> observers) {
            this.observers = observers;
        }

        @Override
        public void handle(int oldPosition, int newPosition) {
            UnderflowEvent event = new UnderflowEvent(oldPosition, newPosition);
            for(ExtendedGameBoardObserver observer: observers) {
                observer.onEvent(event);
            }
        }
    }

    private static class PositionSetHandler implements Handler {

        private final List<ExtendedGameBoardObserver> observers;

        public PositionSetHandler(List<ExtendedGameBoardObserver> observers) {
            this.observers = observers;
        }

        @Override
        public void handle(int oldPosition, int newPosition) {
            PositionSetEvent event = new PositionSetEvent(oldPosition, newPosition);
            for(ExtendedGameBoardObserver observer: observers) {
                observer.onEvent(event);
            }
        }
    }


    private static final int HOME = 1;
    private static final int END = 6;
    private int currentPosition;
    private final List<ExtendedGameBoardObserver> observers = new ArrayList<>();
    private final HomeOverflowHandler homeOverflowHandler = new HomeOverflowHandler(observers);
    private final NotHomeOverflowHandler notHomeOverflowHandler = new NotHomeOverflowHandler(observers);
    private final UnderflowHandler underflowHandler = new UnderflowHandler(observers);
    private final PositionSetHandler positionSetHandler = new PositionSetHandler(observers);

    ExtendedObservedGameBoard() {
        reset();
    }

    @Override
    public void reset() {
        setPosition(HOME);
    }

    @Override
    public void setPosition(int newPosition) {
        int oldPosition = currentPosition;
        currentPosition = newPosition;
        positionSetHandler.handle(oldPosition, currentPosition);

    }
    void add(ExtendedGameBoardObserver observer) {
        observers.add(observer);
    }

    void detach(ExtendedGameBoardObserver observer) {
        observers.remove(observer);
    }


    @Override
    public void advance(int count) {
        int newPosition = currentPosition + count;
        currentPosition = (newPosition > END) ? onOverflow(newPosition) : onUnderflow(newPosition);
    }

    private int onOverflow(int candidatePosition) {
        int newPosition = candidatePosition % END;
        Handler handler = newPosition == HOME ? homeOverflowHandler :  notHomeOverflowHandler;
        handler.handle(currentPosition, newPosition);
        return newPosition;
    }

    private int onUnderflow(int candidatePosition) {
        UnderflowEvent event = new UnderflowEvent(currentPosition, candidatePosition);
        underflowHandler.handle(currentPosition, candidatePosition);
        return candidatePosition;
    }

}
