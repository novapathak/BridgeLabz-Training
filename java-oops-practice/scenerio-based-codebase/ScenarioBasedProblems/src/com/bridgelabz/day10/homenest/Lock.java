package com.bridgelabz.day10.homenest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
    }

    @Override
    public void reset() {
        System.out.println("Lock security code reset.");
    }
}