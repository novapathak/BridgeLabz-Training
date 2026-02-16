package com.bridgelabz.day10.homenest;


public class Main {

    public static void main(String[] args) {

        Device light = new Light("L001");
        Device light2 = new Light("L002");
        Device camera = new Camera("C001");
        Device thermostat = new Thermostat("T001");
        Device lock = new Lock("LK001");
      
        light.turnOn();
        light.addEnergyUsage(5, 0.5);
         light2.turnOn();
         System.out.println(light2.getDeviceId());
        camera.turnOn();
        camera.addEnergyUsage(3, 1.2);

        thermostat.turnOn();
        lock.turnOn();

        System.out.println("Light Energy: " + light.getEnergyUsage());
        System.out.println("Camera Energy: " + camera.getEnergyUsage());

        light.reset();
        camera.reset();
        thermostat.reset();
        lock.reset();
    }
}
