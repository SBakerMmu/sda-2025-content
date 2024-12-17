package singleClassDesign01Product;

class Product {

    private static final double NO_DISCOUNT = 0d;
    private final double fullPrice;
    private double discount = NO_DISCOUNT;

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
