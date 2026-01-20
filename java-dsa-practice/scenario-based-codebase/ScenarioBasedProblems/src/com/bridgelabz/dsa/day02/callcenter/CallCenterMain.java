package com.bridgelabz.dsa.day02.callcenter;

public class CallCenterMain {
	

	    public static void main(String[] args) {

	        CallCenter c = new CallCenter();
	        c.call("Nova", false);
	        c.call("Ashi", true);
	        c.call("Radhika", false);
	        c.call("Nalinee", true);
	        c.attend();
	        c.attend();
	        c.attend();
	        c.showCallCount();
	    }
	}

