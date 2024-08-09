package decorators;

class SuffedCrustPizzaBase implements PizzaComponent {
    @Override
    public String getDescription() {

        return "Stuffed Crust Pizza Base";
    }

    @Override
    public double getPrice() {

        return 2.30d;
    }
}
