package moneyfactorymethod;

public final class Example {

    public static void run() {
        createMoney(new EurMoneyCreator());
        createMoney(new UsdMoneyFactory());
        createMoney( new GbpMoneyCreator());
    }

    private static void createMoney( AbstractMoneyCreator moneyCreator) {
        System.out.format("%s%n", moneyCreator.create(10d));
        System.out.format("%s%n", moneyCreator.create(10.9999d));
        System.out.format("%s%n", moneyCreator.create(0.9999d));
    }
}
