package generalAbstractFamilyFactory;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractInterfaceA createA() {

        return new ConcreteClass2A();
    }

    @Override
    public AbstractInterfaceB createB() {

        return new ConcreteClass2B();
    }
}
