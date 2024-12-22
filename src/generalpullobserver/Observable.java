package generalpullobserver;

import java.util.ArrayList;
import java.util.List;

class Observable  {
    final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void update() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
