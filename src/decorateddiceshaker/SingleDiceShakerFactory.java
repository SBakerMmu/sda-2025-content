package decorateddiceshaker;

class SingleDiceShakerFactory implements DiceShakerFactory {
    @Override
    public DiceShaker create() {
        return new SingleDiceShaker();
    }
}
