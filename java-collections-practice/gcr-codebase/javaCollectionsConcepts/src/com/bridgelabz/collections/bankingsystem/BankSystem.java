package com.bridgelabz.collections.bankingsystem;
import java.util.*;

public class BankSystem {

	HashMap<Integer,Integer> map=new HashMap<>();
	Queue<WithdrawReq> q=new LinkedList<>();

	public void addAccount(int acc, int bal){
		map.put(acc,bal);
}

	public void showAccounts(){
		System.out.println("Accounts");
		for(Integer k:map.keySet()){
			System.out.println(k+" -> "+map.get(k));
		}
}

	public void addWithdraw(int acc,int amt){
		q.add(new WithdrawReq(acc,amt));
}

	public void processWithdraw(){

		while(!q.isEmpty()){
			WithdrawReq r=q.poll();

		if(!map.containsKey(r.acc)){
			System.out.println("No account "+r.acc);
			continue;
}

		int bal=map.get(r.acc);

		if(bal>=r.amt){
			bal=bal-r.amt;
			map.put(r.acc,bal);
			System.out.println("Withdraw ok "+r.acc+" newBal="+bal);
}	
		else{
			System.out.println("Low balance "+r.acc);
}

		}

}

	public void showSortedByBalance(){

		TreeMap<Integer,List<Integer>> t=new TreeMap<>();

		for(Integer acc:map.keySet()){
			int bal=map.get(acc);

			if(!t.containsKey(bal)){
				t.put(bal,new ArrayList<>());
}

			t.get(bal).add(acc);
}

		System.out.println("Sorted by balance");

		for(Integer bal:t.keySet()){
			System.out.println("Bal "+bal+" Accounts "+t.get(bal));
		}

		}

}
