package com.bridgelabz.dsa.day03.smartcheckout;
import java.util.*;
public class SmartCheckout {
	
	Queue<String> customer = new LinkedList<>();
	HashMap<String, Integer> priceQ = new HashMap<>();
	HashMap<String, Integer> stockQ = new HashMap<>();
	
	void addCustomer(String name) {
		customer.add(name);
	}
	
	void addItem(String item,  int price, int stock) {
		priceQ.put(item, price);
		stockQ.put(item, stock);
	}
	
	void billing(String item) {
		if(customer.isEmpty()){
		 System.out.println("No customers in queue");
        return;
		}
	  String customerr = customer.poll();
	  if(stockQ.get(item)>0) {
		  int price = priceQ.get(item);
		  stockQ.put(item, stockQ.get(item)-1);
		  System.out.println(customerr + " bought " + item + " for Rs." + price);
      } else {
          System.out.println(item + " is out of stock");
      }
	  }
	}
