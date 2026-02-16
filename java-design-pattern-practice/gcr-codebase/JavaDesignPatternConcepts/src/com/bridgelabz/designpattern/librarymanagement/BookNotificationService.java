package com.bridgelabz.designpattern.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class BookNotificationService {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyUsers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
