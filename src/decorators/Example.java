package decorators;

public final class Example {

    public static void run(){
        PizzaComponent base = new ItalianPizzaBase();
        show(base);
        PizzaComponent sauce = new TomatoSauce(base);
        show(sauce);
        PizzaComponent topping =  new PepperoniTopping(sauce);
        show(topping);
        PizzaComponent cheese = new MozzarellaCheese(topping);
        show(cheese);


        PizzaComponent pizza = new MozzarellaCheese(
                                    new PepperoniTopping(
                                        new TomatoSauce(
                                            new SuffedCrustPizzaBase()
                                        )
                                    )
                                );


        show(pizza);

    }

    private static void show(PizzaComponent pizza) {
        System.out.format("Order for %s\n", pizza.getDescription());
        System.out.format("Price %.2f\n", pizza.getPrice());
    }

}
