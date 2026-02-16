package com.bridgelabz.day10.homenest;

public class Light extends Device{
	public Light(String deviceId) {
		super(deviceId);
	}
	@Override
	public void reset() {
		 System.out.println("Light brightness reset to default.");
	}

}
