package moneyfactorymethod;

class UsdMoneyFactory extends AbstractMoneyCreator {

    @Override
    protected Money factoryMethod(double value) {
        return new Money(value,Currency.USD);
    }
}
