package simpleproduct;

public class FullPrice extends Price
{
    static final double MIN_PRICE = 0.0d;
    final private double price;

    public FullPrice(double price)
    {
        //do the preconditions
        if(price <= MIN_PRICE)
        {

            //throw execption
        }
        this.price = price;

    }

    public double get()
    {
        return price;
    }
}
