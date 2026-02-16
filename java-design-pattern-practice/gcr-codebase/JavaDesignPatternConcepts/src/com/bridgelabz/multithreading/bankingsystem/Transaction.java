package com.bridgelabz.multithreading.bankingsystem;

public class Transaction implements Runnable{
	
	private BankAccount account;
	private String customer;
	private int amount;
	
	
	public Transaction(BankAccount account , String name, int a) {
		this.account = account;
		this.customer = name;
		this.amount = a;
	}
	
	public void run() {
		account.withdraw(customer, amount);
		
	}

}
