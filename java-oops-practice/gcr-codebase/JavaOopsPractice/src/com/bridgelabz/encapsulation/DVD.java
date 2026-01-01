package com.bridgelabz.encapsulation;

public class DVD extends LibraryItem implements Reservable {

    private boolean isAvailable = true;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            setBorrowerName(borrowerName);
            isAvailable = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
