import globaltradeitemnumber.*;


public class Main {
    public static void main(String[] args) throws InvalidException {


        javarecapsubtypes.Example.run();


        //Product tShirt = new Product(20.00d); //a T Shirt has a normal price of £20.00
        //double sellingPrice = tShirt.getSellingPrice();
        //tShirt.setDiscount(0.25d); //25% off in sale
        //sellingPrice = tShirt.getSellingPrice();

        ImmutableProduct dress = new ImmutableProduct(30.00d); //a dress has a normal price of £30.00
        double normalSellingPrice = dress.getSellingPrice();

        ImmutableProduct discountedDress = dress.setDiscount(0.25d); //25% off in sale
        double  disountedSellingPrice = discountedDress.getSellingPrice();

        CompanyPrefix prefix = new CompanyPrefix(320000);
        ItemReference reference = new ItemReference(377);
        GTIN13 gtin = new GTIN13(prefix,reference);
        GTIN13 scannedGtin = GTIN13.parse("3200000003774");

        System.out.printf("%s\n",prefix);
        System.out.printf("%s\n", reference);
        System.out.printf("%s\n", gtin);


        if(!scannedGtin.equals(gtin))
        {

        }


        System.out.printf("%s = %s %b\n", gtin,scannedGtin, gtin.equals(scannedGtin) );

        bridgeproduct.Example.Run();



    }
}
