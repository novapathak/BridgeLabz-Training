package com.bridgelabz.dsa.day03.smartcheckout;

public class SmartCheckoutMain {
	
	    public static void main(String[] args) {

	        SmartCheckout sc = new SmartCheckout();

	        sc.addItem("Milk", 50, 5);
	        sc.addItem("Bread", 40, 3);

	        sc.addCustomer("Nova");
	        sc.addCustomer("Adarsh");

	        sc.billing("Milk");
	        sc.billing("Bread");
	    }
	}



