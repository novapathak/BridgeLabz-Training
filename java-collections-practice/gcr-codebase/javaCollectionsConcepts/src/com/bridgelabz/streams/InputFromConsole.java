package com.bridgelabz.streams;
import java.io.*;
public class InputFromConsole {
	public static void main(String[]args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter your age");
		String age = br.readLine();
		
		FileWriter fr = new FileWriter("src/com/bridgelabz/streams/input.txt");
		
		fr.write("name: " + name +"\n");
		fr.write("age: " + age +"\n");
		fr.close();
		
		System.out.println("Data saved successfully");
		}
		
		catch(IOException e) {
			System.out.println("Error");
		}
	}
}


