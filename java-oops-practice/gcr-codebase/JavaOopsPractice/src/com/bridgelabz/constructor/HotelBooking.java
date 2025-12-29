package com.bridgelabz.constructor;
class HotelBooking {

    String guestName, roomType;
    int nights;

    // default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // parameterized constructor
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // copy constructor
    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Raj", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);

        System.out.println(h3.guestName + " " + h3.roomType);
    }
}
