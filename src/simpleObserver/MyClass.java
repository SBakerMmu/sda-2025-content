package simpleObserver;

class MyClass {

    final Observer observer;

    MyClass(Observer observer) {
        this.observer = observer;
    }

    void myOperation(String operationParameter) {
        //do the operation
        //notify the observer
        observer.onOperationCalled(operationParameter);
    }
}
