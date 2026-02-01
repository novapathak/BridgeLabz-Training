package com.bridgelabz.collections.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

		HashSet<Policy> hset=new HashSet<>();
		LinkedHashSet<Policy> lset=new LinkedHashSet<>();
		TreeSet<Policy> tset=new TreeSet<>(new ExpiryComparator());

	public void add(Policy p){
		hset.add(p);
		lset.add(p);
		tset.add(p);
}

	public void showAll(){
		System.out.println("All policies");
		for(Policy p:hset){
			System.out.println(p);
		}
	}

	public void expSoon(){
		LocalDate now=LocalDate.now();
		LocalDate lim=now.plusDays(30);

		System.out.println("Expiring soon");

		for(Policy p:tset){
			if(!p.exp.isAfter(lim)){
				System.out.println(p);
}
}
}

	public void byType(String t){
		System.out.println("Coverage "+t);
		for(Policy p:hset){
			if(p.type.equalsIgnoreCase(t)){
				System.out.println(p);
			}
}
}

	public void findDup(List<Policy> list){

		HashSet<String> seen=new HashSet<>();
		HashSet<String> dup=new HashSet<>();

		for(Policy p:list){
			if(!seen.add(p.num)){
				dup.add(p.num);
			}
}

		System.out.println("Duplicate nums "+dup);
}

	}
