package com.bridgelabz.dsa.day01.ambulanceroute;

public class HospitalUnit {
    String name;
    boolean available;
    HospitalUnit next;

    HospitalUnit(String name, boolean available) {
        this.name=name;
        this.available=available;
    }
}
