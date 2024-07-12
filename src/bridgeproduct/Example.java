package bridgeproduct;

import globaltradeitemnumber.*;

import java.awt.color.ProfileDataException;

public class Example {

    public static void Run() throws InvalidException {
        FullPrice fullPrice = new FullPrice(100.0d);
        MinimumPrice minimumPrice = new MinimumPrice(75.0d);
        TaxCalculation standardTax = new StandardTax();
        Product product = new AmazonProduct(new ASIN("B09P4L33SW"), fullPrice, minimumPrice, standardTax);
        ProductPrinter printer = new BagLabelPrinter();
        product.print(printer);

        product = new RetailProduct(new GTIN13(new CompanyPrefix(705353), new ItemReference(135569)), fullPrice, minimumPrice, standardTax);
        printer = new PriceTicketPrinter();
        product.print(printer);

    }

}
