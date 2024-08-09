package polymorphicsellingpriceproduct;

class MinimumPrice
{
    public static final MinimumPrice ZERO = new MinimumPrice(MinimumPrice.NO_PRICE);
    static final double NO_PRICE = 0.0d;
    final private double price;

    public MinimumPrice(double price)
    {
        //do the preconditions
        if(price <= NO_PRICE)
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