package com.bridgelabz.defaultmethod;

interface PaymentProcessor{
	
	void pay(double amount);
	default void refund(double amount) {
		System.out.println("refund not supported");
	}
}
class Paytm implements PaymentProcessor{
	public void pay(double amount) {
		System.out.println("Paytm payment of "+amount);
	}
}

class GooglePay implements  PaymentProcessor{
	
	public void pay(double amount) {
		System.out.println("GooglePay payment of "+ amount);
	}
	
	@Override
	public void refund(double amount) {
		System.out.println("GooglePay refunded "+ amount);
	}
}

public class Payment {
	public static void main(String[]args) {
		PaymentProcessor p = new Paytm();
		PaymentProcessor g = new GooglePay();
	
		p.pay(54.7);
		g.pay(783743.99);
		p.refund(200);
		g.refund(2000);
}
}
