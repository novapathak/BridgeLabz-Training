package com.bridgelabz.dsa.day02.callcenter;
import java.util.*;
public class CallCenter {
	Queue<String> normalQ = new LinkedList<>();
	Queue<String> vipQ = new LinkedList<>();
	HashMap<String, Integer> callCount = new HashMap<>();
	
	//Add call
	void call(String name, boolean isVIP) {
		callCount.put(name, callCount.getOrDefault(name, 0)+1);
		
		if(isVIP) {
			vipQ.add(name);
			System.out.println(name + "VIP added");
		}
		else {
			normalQ.add(name);
			System.out.println(name + "Normal added");
		}
	
	}
	void attend() {
		 if (!vipQ.isEmpty()) {
	            System.out.println("Attending VIP: " + vipQ.poll());

	        } 
		 else if (!normalQ.isEmpty()) {
	            System.out.println("Attending: " + normalQ.poll());
	            } else {
	            System.out.println("No calls waiting");
	        }
	    }

	   
	    void showCallCount() {
	        System.out.println(callCount);
	    }
	
	}
	
