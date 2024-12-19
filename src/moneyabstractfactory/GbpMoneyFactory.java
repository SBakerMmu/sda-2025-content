package moneyabstractfactory;

class GbpMoneyFactory extends AbstractMoneyFactory {

    @Override
    public Money create(double amount) {
        return new Money(amount,Currency.GBP);
    }
}
