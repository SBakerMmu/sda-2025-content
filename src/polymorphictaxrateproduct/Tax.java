package polymorphictaxrateproduct;

import java.util.Objects;

class Tax {

    static final double NO_TAX = 0.0d;
    public static final Tax ZERO = new Tax();
    final private double tax;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tax tax1 = (Tax) o;
        return Double.compare(tax, tax1.tax) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tax);
    }

    Tax()
    {
        this(NO_TAX);
    }

    public Tax(double tax) {
        //do the preconditions
        if (tax <= NO_TAX) {
            //throw exception
        }
        this.tax = tax;

    }

    @Override
    public String toString() {
        return "Tax{" +
                "tax=" + tax +
                '}';
    }

    public double get() {
        return tax;
    }

}
