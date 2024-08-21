package mediator;

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
    public void onChanged(Colleague colleague) {

        if(colleague == basket)
        {
            discounter.setTotal(basket.getTotal());
        }
        if(colleague == discounter)
        {
            basket.setDiscount(discounter.getDiscount());
        }
    }
}
