package com.bridgelabz.generics.smartwarehousesystem;

public class Electronics extends WarehouseItem {
	
   private int warrantyYears;
   
   public Electronics(String name, int warrantyYears) {
	   super(name);
	   this.warrantyYears = warrantyYears;
	   
   }
	
   @Override
   public void displayInfo() {
	 System.out.println( "Electronics Item: " + getName() + "Warranty: "+ warrantyYears + "years");
   }
   
}
