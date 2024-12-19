package moneyfactorymethod;

class GbpMoneyCreator extends AbstractMoneyCreator {

    @Override
    protected Money factoryMethod(double value) {
        return new Money(value,Currency.GBP);
    }
}
