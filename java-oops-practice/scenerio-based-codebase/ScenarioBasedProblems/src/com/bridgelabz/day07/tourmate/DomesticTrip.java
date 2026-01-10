package com.bridgelabz.day07.tourmate;

public class DomesticTrip extends Trip {
	
	public DomesticTrip(String destination, int duration, Activity activity, Hotel hotel, Transport transport) {
		super (destination, duration, activity, hotel, transport);
	}
	
@Override
	public void book() {
	System.out.println("Trip is booked for destination "+ destination);
	System.out.println("Total budget is "+budget);
}

@Override
 public void cancel() {
	System.out.println("Trip is cancelled for destination "+ destination);
	
}
}
