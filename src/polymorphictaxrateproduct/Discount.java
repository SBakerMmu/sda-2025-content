package polymorphictaxrateproduct;

import java.util.Objects;

class Discount {
    static final Discount NO_DISCOUNT = new Discount();
    static final double MIN_DISCOUNT = 0.0d;
    static final double MAX_DISCOUNT = 1.0d;
    private final double discount;

    Discount() {
        this(MIN_DISCOUNT);
    }

    public Discount(double discount) {
        //do the preconditions
        if (discount < MIN_DISCOUNT || discount > MAX_DISCOUNT) {
            //throw an exception
        }
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount1 = (Discount) o;
        return Double.compare(discount, discount1.discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(discount);
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discount=" + discount +
                '}';
    }

    public double get() {
        return discount;
    }

    public Discount add(Discount discount) {
        return new Discount(this.discount + discount.get());
    }

    double applyTo(double value) {
        return value - (value * discount);
    }

    Price applyTo(Price value) {
        return new Price(applyTo(value.get()));
    }
}
