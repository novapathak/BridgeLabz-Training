package com.bridgelabz.day03.swiftcart;

public class SwiftCartMain {
	    public static void main(String[] args) {

	        Product milk = new PerishableProduct("Milk", 50);
	        Product rice = new NonPerishableProduct("Rice", 60);

	        Cart cart = new Cart();
	        cart.addProduct(milk, 2);
	        cart.addProduct(rice, 5);

	        cart.generateBill();
	    }
	


}
