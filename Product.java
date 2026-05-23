package edu.mce.john.ims.model;

public abstract class Product {
	private String id;
	private String name;
	 Double basePrice;
	
	public Product(String id, String name, Double basePrice) {
		super();
		this.id = id;
		this.name = name;
		this.basePrice = basePrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-30s%-15.2f%-15.2f",
				this.id,
				this.name,
				this.basePrice,
				this.calculateFinalPrice());
	}

	public abstract Double calculateFinalPrice();
	
}
