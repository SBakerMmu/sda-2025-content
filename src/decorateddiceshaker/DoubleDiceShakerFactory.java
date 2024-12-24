package decorateddiceshaker;

class DoubleDiceShakerFactory implements DiceShakerFactory {
    private final DiceShakerFactory factory = new SingleDiceShakerFactory();
    @Override
    public DiceShaker create() {
        return new DiceShakerDecorator(factory.create());
    }
}
