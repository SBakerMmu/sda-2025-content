package polymorphismvalues;

public final class Example {

    public static void run() {
        FullPrice fullPrice = new FullPrice(100.0d);
        System.out.format("%s\n", fullPrice);
        DiscountedPrice discountedPrice = DiscountedPrice.ZERO;
        System.out.format("%s\n", discountedPrice);

    }
}
