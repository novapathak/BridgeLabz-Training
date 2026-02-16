package com.bridgelabz.day10.homenest;

public class Device implements IControllable {
private String deviceId;
private boolean status;
protected double energyUsage;
protected String firmwareLog = "No updates yet";
public Device(String deviceId) {
	this.deviceId = deviceId; 
	 this.status = false;
     this.energyUsage = 0;
}
public String getDeviceId() {
	return deviceId;
}
public boolean getStatus() {
	return status;
}
protected void setStatus(boolean status) {
    this.status = status;
} 
public double getEnergyUsage() {
    return energyUsage;
}
public void addEnergyUsage(double hours, double rate) {
	energyUsage += hours*rate;
}
protected void updateFirmwarelog(String log) {
	firmwareLog = log;
}

public String getFirmwareLog() {
	return firmwareLog;
}


public void turnOff() {
	setStatus(false);
	System.out.println(deviceId+" turned off ");
}


public void turnOn() {
	setStatus(true);
	System.out.println(deviceId+" turned on ");
	
}


public void reset() {
	  System.out.println("Device reset to default settings.");
}
}
