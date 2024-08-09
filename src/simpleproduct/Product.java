package simpleproduct;
class Product {

    static final double MIN_SELLING_PRICE = 1.0d;
    private double price = 0d;
    private double discount = 0d;

    public Product(double price) {
        this.price = price;
        checkInvariants();
    }

    public void setPrice(double price)
    {
        //do pre and post condition checks
        this.price = price;
        checkInvariants();
    }

    public void setDiscount(double discount)
    {
        //do pre and post condition checks
        this.discount = discount;
        checkInvariants();
    }

    public double getSellingPrice()
    {
        return price - (price * discount);
    }

    void checkInvariants()
    {


        if(getSellingPrice() < MIN_SELLING_PRICE)
        {
            //throw execption
        }
    }

}
