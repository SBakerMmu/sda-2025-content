package mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Basket implements Collegue {

    private final List<Product> products = new ArrayList<>();
    private Mediator mediator;
    double discount = 0;

    public Basket(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addProduct(Product product)
    {
        products.add(product);
        if(Objects.nonNull(mediator)) {
            mediator.onChanged(this);
        }
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
        if(Objects.nonNull(mediator)) {
            mediator.onChanged(this);
        }
    }

    public double getTotal()
    {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void setDiscount(double discount)
    {
        this.discount = discount;
    }

    public double getTotalWithDiscount()
    {
        return getTotal() * (1d - discount);
    }

    @Override
    public void detatch() {
        mediator = null;
    }
}
