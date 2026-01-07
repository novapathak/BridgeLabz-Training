package com.bridgelabz.day05.eventease;

public class EventEaseMain {

	    public static void main(String[] args) {

	        User organizer = new User("Rahul", "rahul@gmail.com");

	        Event birthday = new BirthdayEvent(
	                "Rahul Birthday",
	                "Mumbai",
	                "15-Aug-2026",
	                50,
	                organizer
	        );

	        Event conference = new ConferenceEvent(
	                "Tech Conference",
	                "Bangalore",
	                "20-Sep-2026",
	                300,
	                organizer
	        );

	        birthday.schedule();
	        conference.schedule();
	    }


}
