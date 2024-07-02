package polymorphictaxrateproduct;

public interface TaxCalculation {
    Tax get(Price price);
}

