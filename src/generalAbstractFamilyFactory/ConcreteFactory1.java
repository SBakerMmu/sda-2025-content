package generalAbstractFamilyFactory;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractInterfaceA createA() {
        return new ConcreteClass1A();
    }

    @Override
    public AbstractInterfaceB createB() {
        return new ConcreteClass1B();
    }
}
