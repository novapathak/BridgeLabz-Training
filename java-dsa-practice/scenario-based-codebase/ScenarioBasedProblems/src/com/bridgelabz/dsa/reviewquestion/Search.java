package com.bridgelabz.dsa.reviewquestion;
import java.util.*;
public class Search {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
    	int arr[] = {23,76,-12,90,-12,43};
		System.out.println("Enter the number you want to check in list");
		int key = sc.nextInt();
		boolean found = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				found = true;
				System.out.println("key if found at index " + i);
				break;
			}
		}
		if(!found) {
			System.out.println("Element not found");
		}
		
	}

}
