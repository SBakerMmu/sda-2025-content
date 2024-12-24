package decorateddiceshaker;

class TripleDiceShakerFactory implements DiceShakerFactory {
    private final DiceShakerFactory factory = new DoubleDiceShakerFactory();
    @Override
    public DiceShaker create() {
        return new DiceShakerDecorator(factory.create());
    }
}
