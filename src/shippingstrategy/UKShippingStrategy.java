package shippingstrategy;

import java.util.List;

class UKShippingStrategy implements ShippingCostStrategy {
    private final static double FIXED_COST = 0.0d;

    @Override
    public double calculate(List<Product> products) {
        return  FIXED_COST;
    }
}
