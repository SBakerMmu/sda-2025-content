package bridgeproduct;

import globaltradeitemnumber.*;

public class Example {

    public static void run() throws InvalidException {
        FullPrice fullPrice = new FullPrice(100.0d);
        MinimumPrice minimumPrice = new MinimumPrice(75.0d);
        TaxCalculation standardTax = new StandardTax();
        Product product = new AmazonProduct(new ASIN("B09P4L33SW"), fullPrice, minimumPrice, standardTax);
        ProductPrinter printer = new BagLabelPrinter();
        product.print(printer);

        product = new RetailProduct(new GTIN13(new CompanyPrefix(705353), new ItemReference(135569)), fullPrice, minimumPrice, standardTax);
        printer = new PriceTicketPrinter();
        product.print(printer);

        ProductFactory productFactory = new AmazonProductFactory();
        product = productFactory.create("B09P4L33SW", fullPrice, minimumPrice, standardTax);
        printer = new BagLabelPrinter();
        product.print(printer);

        TaxCalculation zeroRateTax =  new NoTax();
        productFactory = new RetailProductFactory();
        product = productFactory.create("705353135569", fullPrice, minimumPrice, zeroRateTax);
        printer = new PriceTicketPrinter();
        product.print(printer);


    }

}
