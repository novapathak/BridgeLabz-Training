package com.bridgelabz.collections.vote;

import java.util.*;

public class VoteSystem {

	HashMap<String,Integer> count=new HashMap<>();
	LinkedHashMap<Integer,String> order=new LinkedHashMap<>();
			int id=1;

	public void vote(String name){

		order.put(id,name);
		id=id+1;

		count.put(name,count.getOrDefault(name,0)+1);
}

	public void showCount(){
		System.out.println("Vote count");
	for(String k:count.keySet()){
		System.out.println(k+" -> "+count.get(k));
}
}

public void showOrder(){
	System.out.println("Vote order");
	for(Integer k:order.keySet()){
		System.out.println(k+" "+order.get(k));
	}
}

	public void showSorted(){

		TreeMap<Integer,List<String>> t=new TreeMap<>();

		for(String c:count.keySet()){
int v=count.get(c);

	if(!t.containsKey(v)){
		t.put(v,new ArrayList<>());
}

	t.get(v).add(c);
}

		System.out.println("Sorted results");

		for(Integer v:t.keySet()){
				System.out.println("Votes "+v+" Candidates "+t.get(v));
		}
}

}
