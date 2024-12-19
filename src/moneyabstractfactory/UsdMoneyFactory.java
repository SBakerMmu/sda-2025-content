package moneyabstractfactory;

class UsdMoneyFactory extends AbstractMoneyFactory {

    @Override
    public Money create(double amount) {
        return new Money(amount,Currency.USD);
    }
}
