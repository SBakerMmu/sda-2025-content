package generalstate;

class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
