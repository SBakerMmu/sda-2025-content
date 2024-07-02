import simpleproduct.FullPrice;
import simpleproduct.SellingPrice;

public class ImmutableSellableProduct {
    private final SellingPrice price;

    public ImmutableSellableProduct(FullPrice price) {
        this(new SellingPrice(price));
    }

    public ImmutableSellableProduct(SellingPrice price) {
        this.price = price;
    }
    public double getPrice()
    {
        return price.get();
    }
}
