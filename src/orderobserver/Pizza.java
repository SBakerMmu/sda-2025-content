package orderobserver;


class Pizza {

    PizzaComponent components;

    public Pizza(PizzaBase base) {
        components = base;
    }

    public void addSauce(String name, double price) {
        components = new Sauce(components, name, price);
    }

    public void addTopping(String name, double price) {
        components = new Topping(components, name, price);
    }

    public void addCheese(String name, double price) {
        components = new Cheese(components, name, price);
    }

    public String getDescription() {
        return components.getDescription();
    }

    public double getPrice() {
        return components.getPrice();
    }

}
