package mediator;

import java.util.Objects;

class PricingMediator implements Mediator {


    private Basket basket;
    private Discounter discounter;

    public void register(Basket basket)
    {
        this.basket = basket;
    }
    public void register(Discounter discounter)
    {
        this.discounter = discounter;
    }

    @Override
    public void onChanged(Collegue collegue) {

        if(collegue == basket && Objects.nonNull(discounter))
        {
            discounter.setTotal(basket.getTotal());
        } else if(collegue == discounter && Objects.nonNull(basket))
        {
            basket.setDiscount(discounter.getDiscount());
        }
    }

    public void deregister()
    {
        if(Objects.nonNull(basket))
        {
            basket.detatch();
            basket = null;
        }
        if(Objects.nonNull(discounter))
        {
            discounter.detatch();
            discounter = null;
        }


    }
}
