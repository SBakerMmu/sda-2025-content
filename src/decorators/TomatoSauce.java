package decorators;

class TomatoSauce implements PizzaComponent {

    private final PizzaComponent component;

    public TomatoSauce(PizzaComponent component) {
        this.component = component;
    }


    @Override
    public String getDescription() {
        return component.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getPrice() {
        return component.getPrice() + 2.00d;
    }
}
