package bridgeproduct;

public class NoTax implements TaxCalculation {

    @Override
    public Tax get(Price price) {
        return Tax.ZERO;
    }
}
