package simpleproduct;

public class SellingPrice extends Price {

    static final double MIN_SELLING_PRICE = 1.0d;
    private final FullPrice fullPrice;
    private final Discount discount;

    private final SellingPrice previousSellingPrice;

    public SellingPrice(FullPrice price) {
        this(price, Discount.NO_DISCOUNT, null);
    }

    public SellingPrice(FullPrice fullPrice, Discount discount, SellingPrice previousSellingPrice) {
        //check preconditions on price and discount arguments
        this.fullPrice = fullPrice;
        this.discount = discount;
        this.previousSellingPrice = previousSellingPrice;
        checkInvariants();
    }

    public SellingPrice applyDiscount(Discount newDiscount)
    {
        return new SellingPrice(this.fullPrice, newDiscount, this);
    }

    void checkInvariants()
    {
        if(get() < MIN_SELLING_PRICE)
        {
            //throw execption
        }
    }
    public double get()
    {
        return fullPrice.get() - (fullPrice.get() * discount.get());
    }

    public Price getPreviousSellingPrice()
    {
        return previousSellingPrice;
    }
}
