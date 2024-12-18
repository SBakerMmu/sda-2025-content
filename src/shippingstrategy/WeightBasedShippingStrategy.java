package shippingstrategy;

import java.util.List;

abstract class WeightBasedShippingStrategy {

    protected static double totalWeight(List<Product> products) {
        double weight = 0.0d;
        for (Product product : products) {
            weight += product.getWeight();
        }
        return weight;
    }
}
