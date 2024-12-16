package polymorphismvalues;

import java.util.Objects;

class FullPrice {
    private static final double NONE = 0.0d;
    final private double price;

    public FullPrice(double price) {
        if (price < NONE) {
            //throw
        }
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FullPrice fullPrice = (FullPrice) o;
        return Double.compare(price, fullPrice.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    @Override
    public String toString() {
        return "FullPrice{" +
                "price=" + price +
                '}';
    }

    public double get() {
        return price;
    }
}
