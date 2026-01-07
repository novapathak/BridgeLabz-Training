package com.bridgelabz.day05.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date,
                         int attendees, User organizer) {
        super(name, location, date, attendees,
              organizer, 15000, 8000, 2000);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event Scheduled 🎂");
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}

