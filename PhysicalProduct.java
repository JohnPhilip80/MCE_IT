package edu.mce.john.ims.model;

public class PhysicalProduct extends Product {
	private Double weight;
	private Double shippingCostPerKG;
	
	public PhysicalProduct(String id, 
			String name, 
			Double basePrice,
			Double weight) {
		super(id, name, basePrice);
		this.weight = weight;
		this.shippingCostPerKG = 80.00;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculateFinalPrice() {
		return 
				this.basePrice + 
				(this.weight * 
						this.shippingCostPerKG);
	}

	@Override
	public String toString() {
		return 
			super.toString() + 
			String.format("Shipping: %.2f", 
					(weight *
						this.shippingCostPerKG));
	}
	

}
