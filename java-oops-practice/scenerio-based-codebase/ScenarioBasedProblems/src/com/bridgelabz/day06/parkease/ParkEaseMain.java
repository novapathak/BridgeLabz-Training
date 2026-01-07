package com.bridgelabz.day06.parkease;

public class ParkEaseMain {
	
	    public static void main(String[] args) {

	        Vehicle car = new Car("MH12AB1111");
	        Vehicle bike = new Bike("MH14CD2222");

	        ParkingSlot carSlot = new ParkingSlot("C1", "Mall Basement", "Car");
	        ParkingSlot bikeSlot = new ParkingSlot("B1", "Mall Ground", "Bike");

	        if (carSlot.assignSlot(car)) {
	            System.out.println("Car parked successfully.");
	            System.out.println("Charges: ₹" + car.calculateCharges(5));
	            carSlot.releaseSlot();
	        }

	        if (bikeSlot.assignSlot(bike)) {
	            System.out.println("Bike parked successfully.");
	            System.out.println("Charges: ₹" + bike.calculateCharges(3));
	            bikeSlot.releaseSlot();
	        }

	        System.out.println("Car Slot Status: " + carSlot.getSlotStatus());
	        System.out.println("Booking Log: " + carSlot.getBookingLog());
	    }
	


}
