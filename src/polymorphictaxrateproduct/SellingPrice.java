package polymorphictaxrateproduct;

interface SellingPrice {
	Price get();
	SellingPrice applyDiscount(MinimumPrice minimum, Discount discount);
	SellingPrice removeDiscount();
}
