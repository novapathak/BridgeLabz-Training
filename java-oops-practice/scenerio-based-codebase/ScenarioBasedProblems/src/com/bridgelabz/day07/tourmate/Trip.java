package com.bridgelabz.day07.tourmate;

public abstract class Trip implements IBookable {
	
	protected String destination;
	protected double budget;
	protected int  duration;
	
	protected Hotel hotel;
	protected Activity activity ;
	protected Transport transport;

	
	public Trip(String destination, int duration, Activity activity, Hotel hotel, Transport transport) {
		this.destination = destination;
		this.duration = duration;
		this.activity = activity;
		this.transport = transport;
		this.hotel = hotel;	
		 calculateBudget();
	}
	 private void calculateBudget() {
		 budget = hotel.getHotelCost() + transport.getTransportCost() + activity.getActivityCost();
	 }
	public double getBudget() {
		return budget;
	}
}
