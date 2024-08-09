package decorators;

class MozzarellaCheese implements PizzaComponent {

    private final PizzaComponent component;

    public MozzarellaCheese(PizzaComponent component) {

        this.component = component;
    }

    @Override
    public String getDescription() {

        return component.getDescription() + ", Mozzarella Cheese";
    }

    @Override
    public double getPrice() {

        return component.getPrice() + 0.75d;
    }
}
