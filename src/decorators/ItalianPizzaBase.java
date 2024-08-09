package decorators;

class ItalianPizzaBase implements PizzaComponent {
    @Override
    public String getDescription() {
        return "Italian Pizza Base";
    }

    @Override
    public double getPrice() {
        return 1.00d;
    }
}
