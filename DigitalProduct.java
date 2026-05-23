package edu.mce.john.ims.model;

public class DigitalProduct extends Product {
	private Double discountPercentage;
	
	public DigitalProduct(String id, 
			String name, 
			Double basePrice) {
		super(id, name, basePrice);
		this.discountPercentage = 15.00;
	}

	@Override
	public Double calculateFinalPrice() {
		return 
				this.basePrice - (
						this.basePrice * 
						this.discountPercentage / 100);
	}

	@Override
	public String toString() {
		return 
			super.toString() + 
			String.format("Discount: %.2f%%", 
					this.discountPercentage);
	}
	
}
