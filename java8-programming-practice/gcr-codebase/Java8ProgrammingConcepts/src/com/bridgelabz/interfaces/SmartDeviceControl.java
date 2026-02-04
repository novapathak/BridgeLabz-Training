package com.bridgelabz.interfaces;


interface Device{
	 void turnOn();
     void turnOff();
	
}

 class Lights implements Device{
	
	 @Override
	 public void turnOn() {
		 System.out.println("Lights are On");
	 }
	 @Override
	 public void turnOff() {
		 System.out.println("Lights are turned off");
	 }
}
 
 class AC implements Device{
		
	 @Override
	 public void turnOn() {
		 System.out.println("AC is On");
	 }
	 @Override
	 public void turnOff() {
		 System.out.println("AC is turned off");
	 }
}
 class TV implements Device{
		
	 @Override
	 public void turnOn() {
		 System.out.println("TV is On");
	 }
	 @Override
	 public void turnOff() {
		 System.out.println("TV is turned off");
	 }
}
 
public class SmartDeviceControl {
	public static void main(String[]args) {
		
		Device l = new Lights();
		Device a = new AC();
		Device t = new TV();
		
		l.turnOn();
		a.turnOn();
		t.turnOn();
		l.turnOff();
		a.turnOff();
		t.turnOff();
		 
	}

}
