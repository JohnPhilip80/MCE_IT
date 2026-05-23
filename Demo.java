package edu.mce.john.ims;

import edu.mce.john.ims.model.DigitalProduct;
import edu.mce.john.ims.model.PhysicalProduct;
import edu.mce.john.ims.model.Product;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Welcome to Inventory Management System");
		
		Product p1 = new PhysicalProduct("P-101-2026","Lenova Laptop",39800.00,2.0);
		Product p2 = new PhysicalProduct("P-102-2026","Samsung Phone",63700.00,0.7);
		Product p3 = new PhysicalProduct("P-103-2026","Office Rolling Chair",20600.00,20.0);
		Product p4 = new PhysicalProduct("P-104-2026","Office Desk",30300.00,35.0);
		Product p5 = new DigitalProduct("D-105-2026","EBook Java Learning",3600.00);
		Product p6 = new DigitalProduct("D-106-2026","Advanced Java Learning Video",7300.00);
		
		System.out.printf("%-15s%-30s%-15s%-15s%-30s\n",
				"Id",
				"Name",
				"Base Price",
				"Final Price",
				"Price Info");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);

	}

}

