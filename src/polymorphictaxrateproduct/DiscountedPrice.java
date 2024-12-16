package polymorphictaxrateproduct;

import java.util.Objects;

class DiscountedPrice implements SellingPrice {

    final static DiscountedPrice ZERO = new DiscountedPrice();
    private final FullPrice fullPrice;
    private final MinimumPrice minimumPrice;
    private final Discount discount;
    private final Price sellingPrice;

    public DiscountedPrice() {
        this(FullPrice.ZERO, MinimumPrice.ZERO, Discount.NO_DISCOUNT);
    }

    public DiscountedPrice(FullPrice fullPrice, MinimumPrice minimum, Discount discount) {
        this.fullPrice = fullPrice;
        this.minimumPrice = minimum;
        this.discount = discount;
        this.sellingPrice = calculatePrice();
        checkInvariants();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SellingPrice other) {
            return get().equals(other.get());
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sellingPrice);
    }

    @Override
    public SellingPrice applyDiscount(MinimumPrice minimum, Discount discount) {
        return new DiscountedPrice(this.fullPrice, minimum, this.discount.add(discount));
    }

    @Override
    public SellingPrice removeDiscount() {

        return fullPrice;
    }


    void checkInvariants() {
        if (sellingPrice.get() < minimumPrice.get()) {
            //throw exception
        }
    }

    Price calculatePrice() {

        return discount.applyTo(fullPrice.get());

    }

    @Override
    public String toString() {
        return "DiscountedPrice{" +
                "fullPrice=" + fullPrice +
                ", minimumPrice=" + minimumPrice +
                ", discount=" + discount +
                ", sellingPrice=" + sellingPrice +
                '}';
    }

    public Price get() {
        return sellingPrice;
    }

}
