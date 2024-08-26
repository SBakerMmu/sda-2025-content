package singleClassDesign01Product;

class Product {

    private static final double NO_DISCOUNT = 0d;
    private double discount = NO_DISCOUNT;


    private final double fullPrice;

    public Product(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSellingPrice() {
        return fullPrice - discount;
    }
}
