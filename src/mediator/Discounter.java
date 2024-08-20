package mediator;

import java.util.Objects;

class Discounter implements  Collegue {

    private Mediator mediator;
    private double discount = 0d;

    public Discounter(Mediator mediator) {
        this.mediator = mediator;
    }

    public double getDiscount() {
        return discount;
    }

    public void setTotal(double total) {
        discount = total > 100d ? 0.2d : 0.0d;
        if(Objects.nonNull(mediator)) {
            mediator.onChanged(this);
        }
    }

    @Override
    public void detatch() {
        this.mediator = null;
    }
}


