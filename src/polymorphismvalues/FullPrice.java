package polymorphismvalues;

class FullPrice {
    private static final double NONE = 0.0d;
    final private double price;

    public FullPrice(double price) {
        if (price < NONE) {
            //throw
        }
        this.price = price;
    }

    public double get() {
        return price;
    }
}
