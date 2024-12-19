package generalpullobserver;

import java.util.ArrayList;
import java.util.List;

class ConcreteObservable implements Observable {
    final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void update() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
