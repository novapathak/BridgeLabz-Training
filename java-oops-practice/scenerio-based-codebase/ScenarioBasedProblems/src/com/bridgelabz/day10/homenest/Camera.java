package com.bridgelabz.day10.homenest;


public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
    }

    @Override
    public void reset() {
        System.out.println("Camera angle and resolution reset.");
    }
}
