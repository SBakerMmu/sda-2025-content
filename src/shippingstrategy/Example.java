package shippingstrategy;


public final class Example {

    public static void run() {

        Product book1 = new Product("ABC123", "Agile Principles, Patterns, and Practices in Java", 1.02);
        Product book2 = new Product("DEF456", "The Pragmatic Programmer", 0.62);
        Product book3 = new Product("GHI789", "Refactoring : improving the design of existing code", 2.03);

        Basket basket = new Basket(Destination.RestOfWorld);
        basket.addProduct(book1);
        System.out.format("Shipping %f%n", basket.getShippingCharge());

        basket.addProduct(book2);
        System.out.format("Shipping %f%n", basket.getShippingCharge());

        basket.addProduct(book3);
        System.out.format("Shipping %f%n", basket.getShippingCharge());

        basket.removeProduct(book2);
        System.out.format("Shipping %f%n", basket.getShippingCharge());

        BasketWithShippingStrategy basketWithShippingStrategy = new BasketWithShippingStrategy(new RowShippingStrategy());
        basketWithShippingStrategy.addProduct(book1);
        System.out.format("Shipping %f%n", basketWithShippingStrategy.getShippingCharge());

        basketWithShippingStrategy.addProduct(book2);
        System.out.format("Shipping %f%n", basketWithShippingStrategy.getShippingCharge());

        basketWithShippingStrategy.addProduct(book3);
        System.out.format("Shipping %f%n", basketWithShippingStrategy.getShippingCharge());

        basketWithShippingStrategy.removeProduct(book2);
        System.out.format("Shipping %f%n", basketWithShippingStrategy.getShippingCharge());


    }
}
