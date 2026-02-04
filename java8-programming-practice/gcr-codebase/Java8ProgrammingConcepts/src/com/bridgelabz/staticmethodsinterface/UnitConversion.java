package com.bridgelabz.staticmethodsinterface;
interface Conversion{
	static double kmToMiles(double km) {
		return km*0.621;
	}
	static double kgToLbs(double kg) {
		return kg*2.20462;
	}
}
public class UnitConversion {
   public static void main(String[]args){
	   System.out.println(Conversion.kmToMiles(10));
	   System.out.println(Conversion.kgToLbs(10));

	   
   }
	
}
