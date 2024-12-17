package shippingstrategy;

import java.util.List;

interface ShippingCostStrategy {
    double calculate (List<Product> products);
}
