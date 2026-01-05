package com.bridgelabz.day01.smarthome;

public class SmartHomeMain {
    public static void main(String[] args) {
        Controllable light = new Light();
        Controllable ac = new AC();

        light.turnOn();
        ac.turnOn();
    }
}
