package edu.mce.john.ims.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.mce.john.ims.blueprint.Product;

public class InventoryManager {
	private List<Product> productList;
	private Set<String> productCategories;
	private Map<Product,Integer> productStock;
	
	public InventoryManager() {
		super();
		this.productList = new ArrayList<Product>();
		this.productCategories = new HashSet();
		this.productStock = new HashMap();
	}
	
	public void addProduct(Product product, String category, int initialStock) {
		productList.add(product);
		productCategories.add(category);
		productStock.put(product, initialStock);
	}
	
	public void displayInventory() {
		System.out.println("\n--- Current Inventory (Using Iterator) ---");
        Iterator<Product> iterator = productList.iterator();
        System.out.printf("%-10s%-35s%-20s%-20s%-30s%-30s\n","Id","Name","Base Price","Final Price","Price Info", "Product Stock");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product + "\t\t\t" + productStock.get(product) );
        }
	}
	
	public void displayCategories() {
		System.out.println("\nRegistered Product Categories: " + productCategories);
	}
	
}
