package polymorphicsellingpriceproduct;

class DiscountedPrice implements SellingPrice {

    private final Price fullPrice;
    private final Price sellingPrice;

    public DiscountedPrice(FullPrice fullPrice, MinimumPrice minimum, Discount discount) {
        this(fullPrice.get(), minimum, discount);
    }

    private  DiscountedPrice(Price fullPrice, MinimumPrice minimum, Discount discount) {
        this.fullPrice = fullPrice;
        double price = fullPrice.get() - discount.get();
        if (price < minimum.get()) {
            //throw exception
        }

        sellingPrice = new Price(price);
    }


    @Override
    public SellingPrice applyDiscount(MinimumPrice minimum, Discount discount) {
        return new DiscountedPrice(new FullPrice(this.fullPrice), minimum, discount);
    }

    @Override
    public SellingPrice removeDiscount() {
        return new FullPrice(this.fullPrice);
    }

    public Price get() {
        return sellingPrice;
    }
}
