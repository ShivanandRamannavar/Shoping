package com;

public class Product {
	private String name;
	private int quantity;
	private int cost;

	public Product(String name, int quantity, int cost){
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}

	@Override
	public String toString() {
		return "NAme: "+name+" Quantity: "+quantity+" Cost: "+cost;
	}

}
