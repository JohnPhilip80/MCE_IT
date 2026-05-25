package edu.mce.john.ims.service;

import java.util.List;

import edu.mce.john.ims.model.Invoiceable;
import edu.mce.john.ims.model.Product;

public class Order implements Invoiceable{
	
	private String orderId;
	private String customerName;
	private List<Product> productList;
	private Double totalOrderValue;
		
	public Order(String orderId, String customerName,List<Product> productList) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.productList = productList;
		this.totalOrderValue = 0.0;
		for(Product prod:this.productList)
			this.totalOrderValue += 
			prod.calculateFinalPrice();
	}

	@Override
	public void generateInvoice() {
		System.out.println("\n================== INVOICE ==================");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Items Ordered:\n");
        System.out.printf("%-10s%-35s%-20s%-20s%-30s\n",
        		 "Id","Name","Base Price","Final Price","Price Info");
        for (Product p : productList)
        	System.out.println(p);
        double tax = calculateTax(0.08); // 8% tax
        System.out.printf("\n%-33s: %10.2f","Subtotal", this.totalOrderValue);
        System.out.printf("\n%-33s: %10.2f\n","Tax (8%)", tax);
        System.out.printf("\n%-33s: %10.2f\n","Grand Total", (this.totalOrderValue + tax));
        System.out.println("=============================================");
	}

	@Override
	public Double calculateTax(Double rate) {
		return this.totalOrderValue * rate;
	}

}
