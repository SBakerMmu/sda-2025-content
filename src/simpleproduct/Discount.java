package simpleproduct;

class Discount {
    static final Discount NO_DISCOUNT = new Discount();
    static final double MIN_DISCOUNT = 0.0d;
    private final double discount;

    Discount() {

        discount = 0.0d;
    }

    public Discount(double discount) {
        //do the preconditions
        if (discount < MIN_DISCOUNT) {
            //throw an exception
        }
        this.discount = discount;
    }

    public double get() {
        return discount;
    }
}
