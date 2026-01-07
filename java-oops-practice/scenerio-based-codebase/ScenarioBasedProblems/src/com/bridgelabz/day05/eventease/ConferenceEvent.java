package com.bridgelabz.day05.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date,
                           int attendees, User organizer) {
        super(name, location, date, attendees,
              organizer, 50000, 20000, 5000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference Scheduled 📢");
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}
