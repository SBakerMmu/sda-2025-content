package polymorphismvalues;

import java.util.Objects;

class DiscountedPrice {
    public static final DiscountedPrice ZERO = new DiscountedPrice();

    private final double price;

    private DiscountedPrice() {
        this(FullPrice.ZERO, MinimumPrice.NO_MINIMUM, Discount.NO_DISCOUNT);
    }

    public DiscountedPrice(FullPrice fullPrice, MinimumPrice minimum, Discount discount) {
        this(fullPrice.get(), minimum.get(), discount.get());
    }

    private DiscountedPrice(double fullPrice, double minimum, double discount) {
        this.price = fullPrice - discount;
        if (price < minimum) {
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
