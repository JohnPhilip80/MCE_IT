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
	}
}
