package bridgeproduct;

import globaltradeitemnumber.InvalidException;

interface ProductFactory {
    Product create(String id, FullPrice price, MinimumPrice minimumPrice, TaxCalculation taxCalculation) throws InvalidException;
}
