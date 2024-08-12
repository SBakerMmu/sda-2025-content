package multiObserver;

import java.util.ArrayList;
import java.util.List;

class MyClass {

    final List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }


    void myOperation(String operationParameter) {
        //do the operation
        //notify the observers
        for (Observer observer : observers) {
            observer.onOperationCalled(operationParameter);
        }
    }
}
