package com.bridgelabz.functionalinterface;
import java.util.function.Function;
public class LengthChecker {
public static void main(String []args) {
	
	String msg = "Hello this is Nova Pathak";
	int limit = 23;
	
	Function<String , Integer> check = x -> x.length();
	
	int length = check.apply(msg);
   if(length > limit) {
	   System.out.println("Limit exceeded");
   }
   else {
	   System.out.println("Text is under limit");
   }
}
	
}
