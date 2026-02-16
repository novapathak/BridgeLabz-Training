package com.bridgelabz.multithreading.restaurant;

public class Chef extends Thread {
	
	private String dish;
	private int time;
	
	public Chef(String name, String dish, int time) {
		super(name);
		this.dish = dish;
		this.time = time;
		
	}
	
	public void run() {
		System.out.println(getName()+" started preparing "+ dish);
		for(int i = 0; i <= 100; i+=25) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Error");
			}
			System.out.println(getName()+ " preparing "+ dish + ":"+ i+"% complete");
		}
	}
	

}
