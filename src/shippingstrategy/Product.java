package shippingstrategy;

import java.util.Objects;

class Product {

    private final String itemCode;
    private final String name;
    private final double weight;

    public Product(String itemCode, String name, double weight) {
        this.itemCode = itemCode;
        this.name = name;
        this.weight = weight;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(itemCode, product.itemCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(itemCode);
    }

    @Override
    public String toString() {
        return "Product{" +
                "itemCode='" + itemCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
