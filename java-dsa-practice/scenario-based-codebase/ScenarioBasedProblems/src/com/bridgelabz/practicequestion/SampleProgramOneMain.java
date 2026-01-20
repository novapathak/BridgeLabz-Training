package com.bridgelabz.practicequestion;
import java.util.Scanner;
public class SampleProgramOneMain {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String input = sc.nextLine();

		String result = SampleProgramOne.cleanseAndInvert(input);
		if(result.isEmpty()) {
			 System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is: " + result);
        }
	}

}
