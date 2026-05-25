package edu.mce.john.ims;

import java.util.ArrayList;
import java.util.List;

import edu.mce.john.ims.model.DigitalProduct;
import edu.mce.john.ims.model.PhysicalProduct;
import edu.mce.john.ims.model.Product;
import edu.mce.john.ims.service.Order;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Welcome to Inventory Management System");
		
		List<Product> productList = new ArrayList<Product>();
		/*
		productList.add(new PhysicalProduct("P-101-2026","Lenova Laptop",39800.00,2.0));
		productList.add(new PhysicalProduct("P-102-2026","Samsung Phone",63700.00,0.7));
		productList.add(new PhysicalProduct("P-103-2026","Office Rolling Chair",20600.00,20.0));
		productList.add(new PhysicalProduct("P-104-2026","Office Desk",30300.00,35.0));
		productList.add(new DigitalProduct("D-105-2026","EBook Java Learning",3600.00));
		productList.add(new DigitalProduct("D-106-2026","Advanced Java Learning Video",7300.00));
		
		Order myOrder = new Order("ORD-2026-001",
				"John Philip",
				productList);
		myOrder.generateInvoice();
		*/

		
		//List, Set, Map and Iteration
		InventoryManager inventory = new InventoryManager();
		inventory.addProduct(new PhysicalProduct("P101","Lenova Laptop",32000.00, 3.0),"Electronics",100);
		inventory.addProduct(new PhysicalProduct("P102","Samsung S25 Mobile",74000.00,0.7),"Electronics", 150);
		inventory.addProduct(new PhysicalProduct("P103","Office Rolling Chair",14000.00,25.0),"Furnitures", 25);
		inventory.addProduct(new PhysicalProduct("P104","Office Computer Desk",25000.00,50.0),"Furnitures", 15);
		inventory.addProduct(new DigitalProduct("D101","EBook Learn Java",4500.00),"Education", 40);
		inventory.addProduct(new DigitalProduct("D102","Video Course Advanced Java",8500.00),"Education",30);
		inventory.addProduct(new DigitalProduct("D103","Magazine AI 2026",3100.00),"Education", 20);
		
		inventory.displayCategories();
		inventory.displayInventory();
		
	}
}
