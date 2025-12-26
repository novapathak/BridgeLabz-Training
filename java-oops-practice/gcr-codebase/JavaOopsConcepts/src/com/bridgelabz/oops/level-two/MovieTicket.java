package com.bridgelabz.oops.leveltwo;

public class MovieTicket {

    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Book ticket
    void bookTicket(String seat, double price) {
        if (isBooked) {
            System.out.println("Ticket already booked!");
        } else {
            this.seatNumber = seat;
            this.price = price;
            isBooked = true;
            System.out.println("Ticket booked successfully");
        }
    }

    // Display ticket
    void displayTicket() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Ticket not booked yet");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Dragon");
        ticket.bookTicket("A10", 120);
        ticket.displayTicket();
    }
}
