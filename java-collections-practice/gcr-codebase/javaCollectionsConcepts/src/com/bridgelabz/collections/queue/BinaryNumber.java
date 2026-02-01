package com.bridgelabz.collections.queue;
import java.util.*;
public class BinaryNumber {
	public static void main(String[]args) {
	
	int n = 5;
	Queue<String> q = new LinkedList<>();
	
	q.add("1");
	List<String> list = new ArrayList<>();
	
	for(int i = 0; i < n; i ++) {
		String s = q.remove();
		list.add(s);
		q.add(s +"0");
		q.add(s + "1");
		
		
	}
	System.out.println(list);

}
}
