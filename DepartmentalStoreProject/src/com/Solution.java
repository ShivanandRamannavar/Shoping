package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome To XYZ Departmental Store");
		System.out.println("*********************************");
		Scanner scan=new Scanner(System.in);
		DipartmentalStore store=new DipartmentalStore();


		store.addProduct();

		int choice=1;
		while(choice==1) {

			store.displayProduct();
			store.buyProduct();
			System.out.println("================");
			System.out.println("Press 1 to contineu and Any other nunber to checkout");
			choice=scan.nextInt();
		}

		store.checkout();




	}
}
