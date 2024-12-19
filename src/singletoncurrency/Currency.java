package singletoncurrency;

import java.util.Objects;

class Currency {
    final static char POUND_SYMBOL = '£';
    final static char DOLLAR_SYMBOL = '$';
    final static char EURO_SYMBOL = '€';

    public final static Currency GBP = new Currency("GBP", "British Pound", POUND_SYMBOL, 2);
    public final static Currency USD = new Currency("USD", "US Dollar",DOLLAR_SYMBOL, 2);
    public final static Currency EUR = new Currency("EUR", "Euro",EURO_SYMBOL, 2);

    private final String code;
    private final String name;
    private final char symbol;
    private final int  decimals;

    public Currency(String code, String name, char symbol, int decimals) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
        this.decimals = decimals;
    }

    public String getName() {
        return name;
    }
    public char getSymbol() {
        return symbol;
    }
    public int getDecimals() {
        return decimals;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Currency currency)) return false;
        return Objects.equals(code, currency.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return String.format("%s (%s)",code, symbol);
    }
}
