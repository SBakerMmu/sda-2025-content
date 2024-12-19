package singleclassdesign02prepostcondition;

class Product {

    private final double fullPrice;
    private double discount;

    public Product(double fullPrice) {

        this.fullPrice = fullPrice;
    }

    public void setDiscount(double discount) {
        //check pre-conditions
        if (discount < 0d) {
            //throw an exception
        }

        if (discount > fullPrice) {
            //throw an exception
        }

        //it is safe to update the state of object
        this.discount = discount;
    }


    public void setDiscountPercent(int discountPercent) {
        //the operation converts from a percent to a multiplier
        double discount = fullPrice * (double) discountPercent / 100d;

        //check the postcondition
        if (discount < 0d) {
            //throw an exception
        }

        if (discount > fullPrice) {
            //throw an exception
        }
        //it is safe to update the state of object
        this.discount = discount;
    }


    public double getSellingPrice() {
        return fullPrice - discount;
    }
}
