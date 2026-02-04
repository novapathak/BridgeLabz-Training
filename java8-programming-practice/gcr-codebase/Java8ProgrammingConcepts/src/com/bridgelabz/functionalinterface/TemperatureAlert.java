package com.bridgelabz.functionalinterface;
import java.util.function.Predicate;
public class TemperatureAlert {
public static void main(String[]args) {
	
	double currentTemp = 89.6;
	double threshhold = 37.6;
	
	Predicate<Double> p =  temp ->temp <= threshhold;
	
	if(p.test(currentTemp)) {
		System.out.println("Temperature is normal");
	}
	else {
		System.out.println("ALert: Temperature is high");
	}
}
}
