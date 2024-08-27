package generalstate;

class ConcreteContext implements Context {
    State state;

    ConcreteContext(State initialState)
    {
        state = initialState;
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    public void request()
    {
        this.state.handle(this);
    }
}
