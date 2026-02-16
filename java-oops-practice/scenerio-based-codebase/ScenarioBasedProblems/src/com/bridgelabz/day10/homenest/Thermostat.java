package com.bridgelabz.day10.homenest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
    }

    @Override
    public void reset() {
        System.out.println("Temperature set to default 24°C.");
    }
}
