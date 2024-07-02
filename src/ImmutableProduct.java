public class ImmutableProduct {
    static final double MIN_SELLING_PRICE = 1.0d;
    static final double NO_DISCOUNT = 0.0d;
    private final double price;
    private final double discount;

    public ImmutableProduct(double price) {
        this(price, NO_DISCOUNT);
    }

    public ImmutableProduct(double price, double discount) {
        //check preconditions on price and discount arguments
        this.price = price;
        this.discount = discount;
        checkInvariants();
    }

    void checkInvariants()
    {
        if(getSellingPrice() < MIN_SELLING_PRICE)
        {
            //throw execption
        }
    }
    public ImmutableProduct setDiscount(double discount)
    {
        return new ImmutableProduct(this.price, discount);
    }

    public double getSellingPrice()
    {
        return price - (price * discount);
    }
}
