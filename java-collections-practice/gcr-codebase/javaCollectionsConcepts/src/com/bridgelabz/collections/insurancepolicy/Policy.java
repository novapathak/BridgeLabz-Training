package com.bridgelabz.collections.insurancepolicy;

import java.time.LocalDate;

import java.time.LocalDate;

public class Policy {

	String num;
	String name;
	LocalDate exp;
	String type;
	double amt;

 public Policy (String num, String name, LocalDate exp, String type,double amt){
			this.num=num;
			this.name=name;
			this.exp=exp;
			this.type=type;
			this.amt=amt;
}
 @Override
	public boolean equals(Object o){
		Policy p=(Policy)o;
		return num.equals(p.num);
}

	@Override
		public int hashCode(){
			return num.hashCode();
}
	@Override
		public String toString(){
		return num+" "+name+" "+exp+" "+type+" "+amt;
}
}
