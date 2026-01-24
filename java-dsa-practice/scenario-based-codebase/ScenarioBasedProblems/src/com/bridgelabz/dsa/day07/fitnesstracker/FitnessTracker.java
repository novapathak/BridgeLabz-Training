package com.bridgelabz.dsa.day07.fitnesstracker;
import java.util.*;
public class FitnessTracker {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of users: ");
		int n = sc.nextInt();
		sc.nextLine();
		
	
		int[] arr = new int[n];
		String[] user = new String[n];
		
		System.out.println("Enter name of user : ");
		for(int i = 0; i < n; i++) {
			user[i] = sc.nextLine();
		}
		
		System.out.println("Enter number of steps : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		BubbleSort.bubbleSort(n, arr, user);
		
		for(int i = 0; i < n; i++) {
		System.out.print(i+1 +". " + user[i] + ": " + arr[i]);
		System.out.println();
		}
		
		
	}

}
