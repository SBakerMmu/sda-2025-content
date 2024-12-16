package polymorphismvalues;

import java.util.Objects;

class DiscountedPrice {
    private final double price;

    public DiscountedPrice(FullPrice fullPrice, MinimumPrice minimum, Discount discount) {
        this.price = fullPrice.get() - discount.get();
        if (price < minimum.get()) {
            //throw exception
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DiscountedPrice that = (DiscountedPrice) o;
        return Double.compare(price, that.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    @Override
    public String toString() {
        return "DiscountedPrice{" +
                "price=" + price +
                '}';
    }

    public double get() {
        return price;
    }

}
