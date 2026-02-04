package com.bridgelabz.defaultmethod;

interface Vehicle{
	void displaySpeed(String speed);
	default void displayBattery(int b) {
		System.out.println("Battery is "+b);
	}
}

class Bike implements Vehicle{
	public void displaySpeed(String speed) {
		System.out.println("Speed of bike is "+ speed);
	}
}
class Car implements Vehicle{
	public void displaySpeed(String speed) {
		System.out.println("Speed of Car is "+ speed);
	}
}

public class SmartVehicle {
public static void main(String[]args) {
	
	Vehicle c = new Car();
	Vehicle b = new Bike();
	
	c.displaySpeed("90km/h");
	c.displayBattery(56);
	b.displaySpeed("45km/h");
	b.displayBattery(32);
	
}
}
