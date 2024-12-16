package polymorphictaxrateproduct;

import java.util.Objects;

class Price {
    static final double NO_PRICE = 0.0d;
    final private double price;

    public Price(double price) {
        //do the preconditions
        if (price <= NO_PRICE) {
            //throw exception
        }
        this.price = price;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return Double.compare(price, price1.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                '}';
    }

    public double get() {
        return price;
    }

}
