package com.bridgelabz.inheritance;

public class Device {

    protected String deviceId;
    protected String status; // ON / OFF

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status   : " + status);
    }
}
