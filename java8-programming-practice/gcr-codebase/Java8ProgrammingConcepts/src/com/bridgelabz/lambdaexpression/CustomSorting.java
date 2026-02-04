package com.bridgelabz.lambdaexpression;
import java.util.*;
class Product{
	String name;
	double price;
	double rating;
	double discount;
	
	public Product(String name, double price, double rating, double discount) {
		this.price = price;
		this.discount = discount;
		this.rating = rating;
		this.name = name;
	}
	
	@Override
	public String toString(){
	return "Name: "+ name + " Price: "+ price + " Discount: "+ discount + " Rating: "+ rating;	
	}
}
public class CustomSorting {
	
public static void main(String[]args) {
	ArrayList<Product> arr = new ArrayList<>();
	arr.add(new Product( "Top", 400,10,4));
	arr.add(new Product( "Cycle",2000,10,4));
	arr.add(new Product( "Phone",40000,25,3));
	arr.add(new Product( "Book",4000,10,1));
	
	Collections.sort(arr,(p1,p2)-> Double.compare(p1.price, p2.price));
	for (Product p : arr) {
		System.out.println(p);
	}
}

}
