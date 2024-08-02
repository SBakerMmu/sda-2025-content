package generalAbstractSingleFactory;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractInterface create() {
        return new ConcreteClass1();
    }

}
