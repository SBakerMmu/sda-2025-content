package generalAdaptor;

class Adapter {

    final Adaptee adaptee;

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    void operation() {
        //do whatever is necessary to convert the operation() call to a call to operation2() on the adaptee interface
        adaptee.operation2();
        ;
    }
}


