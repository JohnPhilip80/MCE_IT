package edu.mce.john.ims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.mce.john.ims.model.DigitalProduct;
import edu.mce.john.ims.model.Mobile;
import edu.mce.john.ims.model.PhysicalProduct;
import edu.mce.john.ims.model.Product;
import edu.mce.john.ims.service.InventoryManager;
import edu.mce.john.ims.service.Order;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Welcome to My Mobile Store");
		
		List<Mobile> mobileList = new ArrayList<Mobile>();
		mobileList.add(new Mobile("M1001","Motorola","Edge 3",2020,26900.00));
		mobileList.add(new Mobile("M1002","Samsung","S23",2024,69500.00));
		mobileList.add(new Mobile("M1003","Apple","IPhone 16 Max",2025,115000.00));
		mobileList.add(new Mobile("M1004","Redmi","Note 4",2019,18600.00));
		mobileList.add(new Mobile("M1005","Poco","Grand 2",2021,21500.00));
		mobileList.add(new Mobile("M1006","Apple","IPhone 14",2022,91700.00));
		mobileList.add(new Mobile("M1007","Samsung","S25 Ultra",2026,96300.00));
		
		Collections.sort(mobileList);
		
		System.out.printf("%-10s%-15s%-20s%-15s%-15s\n","Id","Brand","Model","Year Launched","Price");
		for(Mobile mob:mobileList)
			System.out.println(mob);
		
		//sortNumbers();
	}
	public static void sortNumbers() {
		int[] numbers = {7,2,4,1,9};
		
		System.out.println("Numbers Before Sort:");
		for(int n:numbers)
			System.out.print(n + " - ");
		int temp;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(numbers[j]<numbers[i]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("\nNumbers After Sort:");
		for(int n:numbers)
			System.out.print(n + " - ");
	}
}



		
