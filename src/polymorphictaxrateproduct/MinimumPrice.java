package polymorphictaxrateproduct;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MinimumPrice that = (MinimumPrice) o;
        return Double.compare(price, that.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    @Override
    public String toString() {
        return "MinimumPrice{" +
                "price=" + price +
                '}';
    }

    public double get()
    {
        return price;
    }

}
