package decorators;

class PepperoniTopping implements PizzaComponent {

    private final PizzaComponent component;

    public PepperoniTopping(PizzaComponent component) {
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + ", Pepperoni Topping";
    }

    @Override
    public double getPrice() {
        return component.getPrice() + 0.50d;
    }
}
