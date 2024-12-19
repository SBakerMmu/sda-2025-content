package moneyfactorymethod;

class EurMoneyCreator extends AbstractMoneyCreator {

    @Override
    protected Money factoryMethod(double value) {
        return new Money(value,Currency.EUR);
    }
}
