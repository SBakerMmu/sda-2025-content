package shippingstrategy;

import java.util.ArrayList;
import java.util.List;

class Basket {
    private final List<Product> products = new ArrayList<>();
    private final Destination shipTo;


    public Basket(Destination shipTo) {
        this.shipTo = shipTo;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    private double totalWeight()
    {
        double weight = 0.0d;
        for(Product product: products)
        {
            weight += product.getWeight();
        }
        return weight;
    }

    public double getShippingCharge()
    {
        return switch( shipTo) {
            case UK -> 0.0d; //Free Shipping in UK
            case Europe -> totalWeight() * 1.25; //£1.25 per Kg
            default -> switch (products.size()) //Rest of the World
                {
                    case 0 -> 0.0d;
                    default -> Math.max(10.00d, totalWeight() * 5.50); // higher of £10.00 or 5.50 per Kg
                };
        };
    }

}
