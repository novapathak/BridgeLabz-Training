package com.bridgelabz.dsa.day01.ambulanceroute;

public class AmbulanceMain {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.findAvailableUnit();
        route.removeUnit("Radiology");
        route.findAvailableUnit();
    }
}
