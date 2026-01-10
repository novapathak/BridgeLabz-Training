package com.bridgelabz.day07.tourmate;
import java.util.Scanner;

public class TourMateMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hotel hotelH1 = new Hotel(3000,3);
		Hotel hotelH2 = new Hotel(6000,3);
		Hotel hotelH3 = new Hotel(8000,3);
		
		Transport transportA1 = new Transport(6000);
		Transport transportE1 = new Transport(2000);
		
		Activity a1 = new Activity (500);
		Activity a2 = new Activity (200);
		Activity a3 = new Activity (100);
		
		
		// Take input for hotel choice
		System.out.println("Enter your choice for hotel");
		Hotel hotelChoice = null;
		while (hotelChoice == null) {
			System.out.println("1- Non-Ac");
			System.out.println("2- Ac");
			System.out.println("3- Premium-Ac");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 : hotelChoice = hotelH1;
			break;
			case 2 : hotelChoice = hotelH2; 
			break;
			case 3 : hotelChoice = hotelH3;
			break;
			default : System.out.println("please select valid hotel");
		}
		}
			
			// Take input for Transport choice
			System.out.println("Enter your choice for Transport");
			Transport transportChoice = null;
			while (transportChoice == null) {
			System.out.println("1- Non-Ac");
			System.out.println("2- Ac");
		    int chh = sc.nextInt();
			switch(chh) {
			case 1 : transportChoice = transportA1;
			break;
			case 2 : transportChoice = transportE1; 
			break;
			default : System.out.println("please select valid Transport");
		}
			}
			
			// Take input for Activity choice
			System.out.println("Enter your choice for Activity(only 1 activity allowed)");
			Activity activityChoice = null;
			while (activityChoice == null) {
			System.out.println("1- RiverRafting");
			System.out.println("2- Skydiving");
			System.out.println("3- Bungee-jumping");
		    int a = sc.nextInt();
			switch(a) {
			case 1 : activityChoice = a1;
			break;
			case 2 : activityChoice = a2; 
			break;
			case 3 : activityChoice = a3; 
			break;
			default : System.out.println("please select valid Activity");
		}
			}
		
		Trip t1 = new DomesticTrip("Goa", 5, activityChoice, hotelChoice, transportChoice);
		Trip t2 = new DomesticTrip("Patna", 35, activityChoice, hotelChoice, transportChoice);
		
		t1.book();
		t2.book();
		t1.cancel();
		sc.close();	
		}
		
			
		
	}
		
	


