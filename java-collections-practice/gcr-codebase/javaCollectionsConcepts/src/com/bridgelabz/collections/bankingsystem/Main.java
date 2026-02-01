package com.bridgelabz.collections.bankingsystem;
import java.util.*;
public class Main {

public static void main(String[] args){

	BankSystem b=new BankSystem();

	b.addAccount(101,5000);
	b.addAccount(102,2000);
	b.addAccount(103,8000);
	b.showAccounts();
	b.addWithdraw(101,1000);
	b.addWithdraw(102,3000);
	b.addWithdraw(103,2000);
	b.processWithdraw();
	b.showAccounts();
	b.showSortedByBalance();

}
}
