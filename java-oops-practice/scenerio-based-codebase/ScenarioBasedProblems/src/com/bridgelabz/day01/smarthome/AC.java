package com.bridgelabz.day01.smarthome;

class AC extends Appliance implements Controllable {

    public void turnOn() {
        isOn = true;
        System.out.println("AC is cooling");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC is OFF");
    }
}
