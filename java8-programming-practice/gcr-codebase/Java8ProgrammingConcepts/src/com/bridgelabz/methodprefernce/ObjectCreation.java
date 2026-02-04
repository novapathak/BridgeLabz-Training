package com.bridgelabz.methodprefernce;
import java.util.stream.Collectors;
import java.util.*;

 class objectref{
	int id;
	
	public objectref(int i) {
		this.id = i;
	}
	@Override
	public String toString() {
		return "Invoice id: " + id;
	}
}
public class ObjectCreation {

	public static void main(String[]args) {
		List<Integer> list = new ArrayList<>();
		list.add(201);
		list.add(202);
		list.add(401);
		
		List<objectref> o = list.stream().map(objectref::new).collect(Collectors.toList());
		o.forEach(System.out::println);
	}
	
}
