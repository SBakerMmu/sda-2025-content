package moneyfactorymethod;

abstract class AbstractMoneyFactory implements MoneyFactory {
    private final Currency currency;

    public AbstractMoneyFactory(Currency currency) {
        this.currency = currency;
    }

    @Override
    public Money create(double amount) {
        return new Money(amount, currency);
    }
}
