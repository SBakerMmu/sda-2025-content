package decorateddiceshaker;

class DiceShakerDecorator implements DiceShaker{
    private final DiceShaker component;
    private final DiceShaker shaker = new SingleDiceShaker();
    DiceShakerDecorator(DiceShaker component) {
        this.component = component;
    }

    @Override
    public int shake() {
        return shaker.shake() + component.shake();
    }
}
