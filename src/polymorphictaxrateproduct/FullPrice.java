package polymorphictaxrateproduct;

import java.util.Objects;

class FullPrice implements SellingPrice
{
    static final FullPrice ZERO = new FullPrice();
    private static final double NO_PRICE = 0.0d;
    final private Price price;

    FullPrice()
    {
        this(NO_PRICE);
    }

    public FullPrice(double price)
    {
        this(new Price(price));

    }

    public FullPrice(Price price)
    {
        this.price = price;

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SellingPrice other) {
            return get().equals(other.get());
        } else return false;
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

    public Price get()
    {
        return price;
    }

	@Override
	public SellingPrice applyDiscount(MinimumPrice minimum, Discount discount) {
		return new DiscountedPrice(this, minimum, discount);
	}


	@Override
	public SellingPrice removeDiscount() {

		return this;
	}
}
