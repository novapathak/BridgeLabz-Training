package com.bridgelabz.staticmethodsinterface;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtil{
	static String formatDate(LocalDate date, String pattern ) {
		DateTimeFormatter formatt = DateTimeFormatter.ofPattern(pattern);
		return date.format(formatt);
	}
	
}
public class InvoiceGenerator {
	  public static void main(String[] args) {

		  LocalDate today = LocalDate.now();
		  System.out.println(DateUtil.formatDate(today, "dd-MM-yyyy"));
	        System.out.println(DateUtil.formatDate(today, "MMM dd, yyyy"));

	
	

}
}
 