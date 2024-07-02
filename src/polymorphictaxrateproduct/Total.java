package polymorphictaxrateproduct;

public class Total {
    final private Price price;
    final private Tax tax;

    public Total(Price price, Tax tax) {
        this.price = price;
        this.tax = tax;
    }

    public double get() {
        return price.get() + tax.get();
    }
}
