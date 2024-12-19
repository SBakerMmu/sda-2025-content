package moneyabstractfactory;

class EurMoneyFactory extends AbstractMoneyFactory {

    @Override
    public Money create(double amount) {
        return new Money(amount,Currency.EUR);
    }
}
