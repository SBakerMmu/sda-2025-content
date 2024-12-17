package simpleproduct;

public final class Example {

    public static void run() {
        ImmutableProduct dress = new ImmutableProduct(30.00d); //a dress has a normal price of £30.00
        double normalSellingPrice = dress.getSellingPrice();

        ImmutableProduct discountedDress = dress.setDiscount(0.25d); //25% off in sale
        double disountedSellingPrice = discountedDress.getSellingPrice();

    }
}
