package polymorphismvalues;

public final class Example {

    public static void run() {
        FullPrice fullPrice = new FullPrice(100.0d);
        MinimumPrice minimumPrice = MinimumPrice.NO_MINIMUM;
        Discount discount = Discount.NO_DISCOUNT;
        DiscountedPrice discountedPrice = new DiscountedPrice(fullPrice, minimumPrice, discount);
        System.out.format("Discounted Price %s\n", discountedPrice.get());

    }
}
