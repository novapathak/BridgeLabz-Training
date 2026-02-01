package com.bridgelabz.collections.insurancepolicy;
import java.time.LocalDate;
import java.util.*;

public class Main {

	public static void main(String[] args){

		PolicyManager m=new PolicyManager();

		Policy a=new Policy("P1","Ram",LocalDate.now().plusDays(10),"Health",5000);
		Policy b=new Policy("P2","Shyam",LocalDate.now().plusDays(40),"Auto",3000);
		Policy c=new Policy("P3","Mohan",LocalDate.now().plusDays(5),"Home",7000);
		Policy d=new Policy("P1","RamDup",LocalDate.now().plusDays(10),"Health",5000);

				m.add(a);
				m.add(b);
				m.add(c);
				m.add(d);
				m.showAll();
				m.expSoon();
				m.byType("Health");
				m.findDup(Arrays.asList(a,b,c,d));

}
}
