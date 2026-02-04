package com.bridgelabz.markerinterface;

class Product implements Cloneable{
	int productId;
	String name;

    Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }
    public Product clone()throws CloneNotSupportedException{
    	return (Product) super.clone();
    }
	
}
public class Cloning {
	public static void main(String[] args) throws Exception {

        Product p1 = new Product(1, "Laptop");

        Product p2 = p1.clone();

        System.out.println(p1.productId + " " + p1.name);
        System.out.println(p2.productId + " " + p2.name);
    }
}
