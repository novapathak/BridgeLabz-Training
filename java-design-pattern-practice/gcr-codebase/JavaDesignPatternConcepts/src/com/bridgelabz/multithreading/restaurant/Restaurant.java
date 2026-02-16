package com.bridgelabz.multithreading.restaurant;

public class Restaurant {
	public static void main(String[] args) throws InterruptedException {
		
		Chef c1 = new Chef("Chef-1", "pizza", 3000);
		Chef c2 = new Chef("Chef-2", "burger", 4000);
		Chef c3 = new Chef("Chef-3", "pasta", 6000);
		Chef c4 = new Chef("Chef-4", "salad", 7000);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		
		c1.join();
		c2.join();
		c3.join();
		c4.join();
		
		System.out.println("Kitchen is closed now");
		
	}

}
