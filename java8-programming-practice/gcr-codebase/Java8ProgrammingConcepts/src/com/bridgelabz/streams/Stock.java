package com.bridgelabz.streams;
import java.util.*;
public class Stock {
	public static void main(String[]args) {
		List<Double> list = Arrays.asList(345.6, 76.5 , 2234.6 ,677.0, 76.5);
		
		list.forEach(price->
		System.out.println(price)
		);
	}
}


