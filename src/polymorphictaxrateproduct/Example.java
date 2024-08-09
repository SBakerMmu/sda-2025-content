package polymorphictaxrateproduct;

public final class Example {

    public static void Run() {
        FullPrice fullPrice = new FullPrice(100.0d);
        MinimumPrice minimumPrice = new MinimumPrice(75.0d);
        TaxCalculation standardTax = new StandardTax();
        Product product = new Product(fullPrice, minimumPrice, standardTax);
        Price price = product.getPrice();
    }

}
