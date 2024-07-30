package bridgeproduct;

import globaltradeitemnumber.ASIN;
import globaltradeitemnumber.InvalidException;

public interface ProductFactory {
    Product create(String id, FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) throws InvalidException;
}
