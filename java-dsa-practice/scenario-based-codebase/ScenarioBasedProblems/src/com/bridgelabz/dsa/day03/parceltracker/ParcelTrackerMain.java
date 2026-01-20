package com.bridgelabz.dsa.day03.parceltracker;
import java.util.*;
public class ParcelTrackerMain {
	    public static void main(String[] args) {
	        ParcelTracker tracker = new ParcelTracker();

	        tracker.addStage("Packed");
	        tracker.addStage("Shipped");
	        tracker.addStage("In Transit");
	        tracker.addStage("Delivered");

	        tracker.addAfter("Shipped", "Warehouse Check");

	        tracker.display();
	    }
	}



