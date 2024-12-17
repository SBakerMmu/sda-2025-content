package polymorphictaxrateproduct;

interface SellingPrice {
    double get();

    SellingPrice applyDiscount(MinimumPrice minimum, Discount discount);

    SellingPrice removeDiscount();
}
