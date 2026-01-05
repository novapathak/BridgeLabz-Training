package com.bridgelabz.day01.smarthome;

class Light extends Appliance implements Controllable {

    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }
}
