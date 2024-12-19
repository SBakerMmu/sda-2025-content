package moneyabstractfactory;

public final class Example {

    public static void run() {
        createMoney(new EurMoneyFactory());
        createMoney(new UsdMoneyFactory());
        createMoney( new GbpMoneyFactory());
    }

    private static void createMoney(AbstractMoneyFactory moneyFactory) {
        System.out.format("%s%n", moneyFactory.create(10d));
        System.out.format("%s%n", moneyFactory.create(10.9999d));
        System.out.format("%s%n", moneyFactory.create(0.9999d));
    }
}
