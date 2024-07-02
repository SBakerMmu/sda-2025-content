package polymorphicsellingpriceproduct;

public class Product {

    private SellingPrice sellingPrice;
    private MinimumPrice minimumPrice;

    public Product(FullPrice price, MinimumPrice minimumPrice) {
        this.sellingPrice =price;
        this.minimumPrice = minimumPrice;
    }

    public void applyDiscount(Discount discount)
    {
       sellingPrice = sellingPrice.applyDiscount(minimumPrice, discount);
    }
    
    public void removeDiscount()
    {
    	sellingPrice = sellingPrice.removeDiscount();
    }

    public Price getSellingPrice()
    {
        return sellingPrice.get();
    }
}