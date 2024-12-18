package shippingstrategy;

import java.util.List;

class RowShippingStrategy extends WeightBasedShippingStrategy implements ShippingCostStrategy {
    private final static double NO_COST = 0.0d;
    private final static double MIN_CHARGE = 10.0d;
    private final static double CHARGE_PER_KG = 5.5d;

    @Override
    public double calculate(List<Product> products) {
        return products.size() == 0.0d ? NO_COST : Math.max(MIN_CHARGE, totalWeight(products) * CHARGE_PER_KG); // higher of MIN_CHARGE or CHARGE_PER_KG
    }
}
