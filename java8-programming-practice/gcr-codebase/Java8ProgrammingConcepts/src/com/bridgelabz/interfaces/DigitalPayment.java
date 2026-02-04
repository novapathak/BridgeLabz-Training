package com.bridgelabz.interfaces;

interface Payment{
	void pay();
}

class UPI implements Payment{
	
	@Override
	public void pay() {
		System.out.println("Payment done through UPI");
	}
}
class CreditCard implements Payment{
	
	@Override
	public void pay() {
		System.out.println("Payment done through CreditCard");
	}
}
class Wallet implements Payment{
	
	@Override
	public void pay() {
		System.out.println("Payment done through Wallet");
	}
}
public class DigitalPayment {
public static void main(String[]args) {
	
	Payment upi = new UPI();
	Payment card = new CreditCard();
	Payment wallet = new Wallet();
	 upi.pay();
	 card.pay();
     wallet.pay();
}
}
