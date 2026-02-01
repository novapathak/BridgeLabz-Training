package com.bridgelabz.collections.vote;

public class Main {

public static void main(String[] args){

	VoteSystem v=new VoteSystem();

		v.vote("Ram");
		v.vote("Shyam");
		v.vote("Ram");
		v.vote("Mohan");
		v.vote("Ram");
		v.vote("Shyam");
		v.showOrder();
		v.showCount();
		v.showSorted();
		
}
}
