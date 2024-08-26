package polymorphismvalues;

class DiscountedPrice  {
    private final double price;

    public DiscountedPrice(FullPrice fullPrice, MinimumPrice minimum, Discount discount) {
        this.price = fullPrice.get() - discount.get();
        if (price < minimum.get()) {
            //throw exception
        }
    }

    public double get() {
        return price;
    }

}
