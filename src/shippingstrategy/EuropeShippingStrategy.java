package shippingstrategy;

import java.util.List;

class EuropeShippingStrategy extends WeightBasedShippingStrategy implements ShippingCostStrategy {
    private final static double CHARGE_PER_KG = 1.25d;

    @Override
    public double calculate(List<Product> products) {
        return  totalWeight(products) * CHARGE_PER_KG;
    }

}
