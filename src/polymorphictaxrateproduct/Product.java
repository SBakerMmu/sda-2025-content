package polymorphictaxrateproduct;

public class Product {

    private SellingPrice sellingPrice;
    private final MinimumPrice minimumPrice;
    private final TaxCalculation taxCalculation;

    public Product(FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) {
        this.sellingPrice = price;
        this.minimumPrice = minimumPrice;
        this.taxCalculation = taxCalculation;
    }

    public void applyDiscount(Discount discount) {

        sellingPrice = sellingPrice.applyDiscount(minimumPrice, discount);
    }

    public void removeDiscount() {

        sellingPrice = sellingPrice.removeDiscount();
    }

    public Price getSellingPrice() {

        return sellingPrice.get();
    }

    public Tax getTax() {
        return taxCalculation.get(getSellingPrice());
    }
    public Total getTotal() {
        return new Total(getSellingPrice(), getTax());
    }

}
