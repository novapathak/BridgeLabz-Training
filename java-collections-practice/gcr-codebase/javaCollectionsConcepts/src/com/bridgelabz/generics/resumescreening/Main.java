package com.bridgelabz.generics.resumescreening;
import java.util.List;
import java.util.ArrayList;
public class Main {
public static void main(String[]args) {
	List<SE> seList = new ArrayList<>();
	seList.add(new SE("Aman"));
	
	System.out.println("Software Engineer Screening:");
	ResumeWildCard.processresume(seList);
}
}
