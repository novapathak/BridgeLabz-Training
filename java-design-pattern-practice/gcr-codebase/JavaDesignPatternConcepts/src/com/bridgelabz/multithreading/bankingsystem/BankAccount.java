package com.bridgelabz.multithreading.bankingsystem;

public class BankAccount {
	
	private double initialBalance = 10000;
	
	public synchronized void  withdraw(String customer, int amount) {
		if(initialBalance>= amount ) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Error ");
			}
			initialBalance -= amount;
			
			System.out.println("Transaction Successful: "+ customer+ ", Amount "+amount+", Balance: "+ initialBalance);
		}
		else {
			System.out.println("Transaction Failed");
		}
	}
	

}
