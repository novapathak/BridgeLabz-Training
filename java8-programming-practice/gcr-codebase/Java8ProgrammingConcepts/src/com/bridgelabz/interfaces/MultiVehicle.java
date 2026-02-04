package com.bridgelabz.interfaces;

interface Vehicle{
	void rent();
	void returnVehicle();
}
class Cars implements Vehicle{	
	@Override
	public void rent() {
		System.out.println("Car is rented");
	}
    @Override
    public void returnVehicle() {
    	System.out.println("Car is returned");    }
	}
class Buses implements Vehicle{	
	@Override
	public void rent(){
		System.out.println("Buses is rented");
	}
    @Override
    public void returnVehicle() {
    	System.out.println("Buses is returned");    }
	}

class Bikes implements Vehicle{	
	@Override
	
	public void rent() {
		System.out.println("Bikes is rented");	
	}	
    @Override
    public void returnVehicle() {
    	System.out.println("Bikes is returned");    }
	}

public class MultiVehicle {
public static void main(String[]args) {
	
	Vehicle v = new Cars();
	Vehicle w = new Buses();
	Vehicle x = new Bikes();
	
		v.rent();
		w.rent();
		x.rent();
		v.returnVehicle();
		x.returnVehicle();
		w.returnVehicle();
    
	
	
	
	
}
}
