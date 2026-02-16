package com.bridgelabz.designpattern.librarymanagement;

public class LibraryUserObserver implements Observer {

    private String name;

    public LibraryUserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + name + ": " + message);
    }
}
