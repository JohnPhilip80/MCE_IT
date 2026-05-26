package edu.mce.john.ims.model;

public class Mobile implements Comparable<Mobile> {
	private String id;
	private String brand;
	private String model;
	private Integer yearLaunched;
	private Double price;
	public Mobile(String id, String brand, String model, Integer yearLaunched, Double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.yearLaunched = yearLaunched;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYearLaunched() {
		return yearLaunched;
	}
	public void setYearLaunched(Integer yearLaunched) {
		this.yearLaunched = yearLaunched;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%-10s%-15s%-20s%-15d%-10.2f",
				this.id,
				this.brand,
				this.model,
				this.yearLaunched,
				this.price);
	}
	@Override
	public int compareTo(Mobile o) {
		return (int)( this.getPrice() - o.getPrice());
	}
	
}
