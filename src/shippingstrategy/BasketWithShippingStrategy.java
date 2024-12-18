package shippingstrategy;

import java.util.ArrayList;
import java.util.List;

class BasketWithShippingStrategy {
    private final List<Product> products = new ArrayList<>();
    private final ShippingCostStrategy shippingCostStrategy;


    public BasketWithShippingStrategy(ShippingCostStrategy shippingCostStrategy) {
        this.shippingCostStrategy = shippingCostStrategy;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getShippingCharge()
    {
        return shippingCostStrategy.calculate(products);
    }
}
