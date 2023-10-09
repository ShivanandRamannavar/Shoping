package com;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import customexception.InvalidChoiceException;
import customexception.InvalidQuantityException;

public class DipartmentalStore {
	//key->Integer-> Product Id    &  value-> Product -> Product Ibject
	LinkedHashMap<Integer, Product> db=new LinkedHashMap<Integer, Product>();
	Scanner scan=new Scanner(System.in);
	int totalBill=0;
	public void addProduct() {

		db.put(1, new Product("Chocolates", 10, 10));
		db.put(2, new Product("Biscuits", 20, 20));
		db.put(3, new Product("IceCreams", 30, 50));

	}

	public void displayProduct() {

		Set<Integer> keys=db.keySet();	

		for(int key:keys) {
			Product p=db.get(key);//getting yhe Product
			System.out.println("Enter "+key+" to order "+p.getName());
			System.out.println("Availabel Quantity: "+p.getQuantity());
			System.out.println("Cost : Rs."+p.getCost());
			System.out.println("=================================");		
		}

	}

	public void buyProduct() {
		System.out.println("Enter Choice");
		int choice=scan.nextInt();

		Product p=db.get(choice);

		if(p!=null) {
			System.out.println("Enter Quantity");
			int quantity=scan.nextInt();

			if(quantity<=p.getQuantity()) {
				//current product cost calculation
				int productCost=quantity * p.getCost();  //(Importent)

				//Adding Current Product Cost To Toatal Bill

				totalBill= totalBill+productCost;//tottalBill+=productCost   (importent)
				//Upadated new Quantity
				p.setQuantity(p.getQuantity()-quantity);  //(importent)

				System.out.println("Orderd "+quantity+" "+p.getName());
				System.out.println("Current product cost: "+productCost);
				System.out.println("Total Bill as Of Now "+totalBill);


			}
			else {
				try {
					throw new InvalidQuantityException("Invalid Quantity");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}

		}
		else {
			try {
		     throw new InvalidChoiceException("Invalid Choice");
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
	public void checkout() {

		System.out.println("Total Bill: "+totalBill);
		System.out.println("Thank You for Shopping!!");

	}
}























