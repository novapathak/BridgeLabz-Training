package com.bridgelabz.day07.tourmate;

public class Hotel {
	
	private double hotelCost;
	private int nights;
	public Hotel(double hotelCost, int nights) {
		this.hotelCost = hotelCost;
		this.nights = nights;
	}
	public double getHotelCost() {
		return hotelCost*nights;
	}

}
