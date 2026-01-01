package com.bridgelabz.inheritance;

public class Thermostat extends Device {

    private int temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus()
    @Override
    public void displayStatus() {
        System.out.println("\n--- Thermostat Status ---");
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}
