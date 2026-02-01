package com.bridgelabz.collections.setinterface;
import java.util.*;
public class SortedSet {
	public static void main(String[] args) {

		        HashSet<Integer> set = new HashSet<>();
		        set.add(5);
		        set.add(2);
		        set.add(9);
		        set.add(1);
		        set.add(3);
		        List<Integer> list = new ArrayList<>(set);
		        Collections.sort(list);

		        System.out.println(list);
		    }
		}
	


