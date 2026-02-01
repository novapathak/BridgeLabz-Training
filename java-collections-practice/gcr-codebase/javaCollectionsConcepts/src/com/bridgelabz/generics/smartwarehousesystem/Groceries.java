package com.bridgelabz.generics.smartwarehousesystem;

public class Groceries extends WarehouseItem {
	private String expiryDate;
	
	public Groceries(String name, String expiryDate) {
		super(name);
		this.expiryDate = expiryDate;
		
	}
	@Override
	
	public void displayInfo() {
	System.out.println( "Groceries: " + getName() + "ExpiryDate: "+ expiryDate); 
	}

}
