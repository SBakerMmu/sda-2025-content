package observeddicegame;

import java.util.List;

class HomeOverflowHandler implements OverflowHandler {

    private final List<ExtendedGameObserver> observers;

    public HomeOverflowHandler(List<ExtendedGameObserver> observers) {
        this.observers = observers;
    }

    @Override
    public void handle(int currentPosition, int newPosition) {
        WinEvent event = new WinEvent(currentPosition, newPosition);
        for(ExtendedGameObserver observer: observers) {
            observer.onWin(event);
        }
    }
}
