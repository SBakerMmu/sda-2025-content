package generalstate;

class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        context.changeState(new ConcreteStateB());
    }
}

