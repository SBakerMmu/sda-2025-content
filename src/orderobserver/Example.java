package orderobserver;


public final class Example {
    public static void run() {
        Order order = new Order(10);
        KitchenPrinter kitchenPrinter = new KitchenPrinter();
        order.addObserver(kitchenPrinter);

        Pizza pizza1 = new Pizza(new PizzaBase("Italian", 2.25d));
        pizza1.addSauce("Tomato", 1.25d);
        pizza1.addTopping("Pineapple", 2.30d);
        pizza1.addCheese("Cheddar", 1.45d);
        order.addPizza(pizza1);

        Pizza pizza2 = new Pizza(new PizzaBase("Stuffed Crust", 4.70d));
        pizza2.addSauce("Tomato", 1.25d);
        pizza2.addTopping("Mushroom", 2.30d);
        order.addPizza(pizza2);

        order.save();
    }
}