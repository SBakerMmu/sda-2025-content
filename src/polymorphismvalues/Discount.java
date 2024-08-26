package polymorphismvalues;

class Discount
{
    public static final Discount NO_DISCOUNT = new Discount();
    private static final double NONE = 0.0d;
    private final double discount;

    private Discount()
    {
        discount = NONE;
    }

    public Discount(double discount )
    {
        //do the preconditions
        if(discount < NONE)
        {
            //throw an exception
        }
        this.discount = discount;
    }

    public double get()
    {
        return discount;
    }
}
