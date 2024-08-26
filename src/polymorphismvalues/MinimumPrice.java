package polymorphismvalues;

class MinimumPrice
{
    public static final MinimumPrice NO_MINIMUM = new MinimumPrice();
    static final double NONE = 0.0d;

    final private double price;

    private MinimumPrice()
    {
        price = NONE;
    }

    public MinimumPrice(double price)
    {
        //do the preconditions
        if(price < NONE)
        {
            //throw exception
        }
        this.price = price;
    }

    public double get()
    {
        return price;
    }
}
