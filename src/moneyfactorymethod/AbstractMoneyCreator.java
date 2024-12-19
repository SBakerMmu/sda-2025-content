package moneyfactorymethod;

abstract class AbstractMoneyCreator {
    public Money create(double value){
        return factoryMethod(value);
    }

    protected abstract Money factoryMethod(double value);
}
