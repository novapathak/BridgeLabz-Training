package com.bridgelabz.generics.onlinemarketplace;

public class Discount {
	
	public static<T extends Product<?>> void discount(T product, double percentage) {
		double discount = product.getPrice()*(percentage/100);
		product.setPrice(product.getPrice()-discount);

	}

}
