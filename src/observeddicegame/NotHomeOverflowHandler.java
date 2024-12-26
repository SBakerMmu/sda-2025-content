package observeddicegame;

import java.util.List;

class NotHomeOverflowHandler implements OverflowHandler {

    private final List<ExtendedGameObserver> observers;

    public NotHomeOverflowHandler(List<ExtendedGameObserver> observers) {
        this.observers = observers;
    }

    @Override
    public void handle(int currentPosition, int newPosition) {
        OverflowEvent event = new OverflowEvent(currentPosition, newPosition);
        for(ExtendedGameObserver observer: observers) {
            observer.onOverflow(event);
        }
    }
}
