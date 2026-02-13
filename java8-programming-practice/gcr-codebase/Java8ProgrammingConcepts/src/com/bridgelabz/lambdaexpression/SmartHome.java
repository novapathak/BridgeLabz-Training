package com.bridgelabz.lambdaexpression;

interface LightAction{
	void turnOn();
}

public class SmartHome {

	public static void main(String[]args) {
		LightAction motionTrigger = () -> {
			System.out.println("Lights on");
			
		};
		LightAction nightTrigger = () -> System.out.println("Lights Off");
		LightAction voiceTrigger = () -> System.out.println("lights on");

		motionTrigger.turnOn();
		nightTrigger.turnOn();
		voiceTrigger.turnOn();

	}
}
