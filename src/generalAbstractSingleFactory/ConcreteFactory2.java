package generalAbstractSingleFactory;
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractInterface create() {
        return new ConcreteClass2();
    }
}
