package polymorphicsellingpriceproduct;

class FullPrice implements SellingPrice
{
    final private Price price;

    public FullPrice(double price)
    {
        this.price = new Price(price);

    }
    FullPrice(Price price)
    {
        this.price = price;

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
