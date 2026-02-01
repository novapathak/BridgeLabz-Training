package com.bridgelabz.collections.listinterface;
import java.util.*;
public class OrderedRemoveDuplicate {
	public static void main(String[]args) {
	List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
	
	/*List<Integer> arr = new ArrayList<>();
	for(int i: list) {
		if(!arr.contains(i)) {
			arr.add(i);
		}
	}*/
	
	List<Integer> arr =new ArrayList<>( new LinkedHashSet<>(list));
	
	
	System.out.println(arr);
	
	
}
}
