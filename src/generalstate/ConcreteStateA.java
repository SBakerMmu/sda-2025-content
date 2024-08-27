package generalstate;

class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        context.changeState(new ConcreteStateB());
    }
}
