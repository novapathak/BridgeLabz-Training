package com.bridgelabz.streams;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String dept;
	double salary;
	
	public Employee(int id, String name, String dept, double salary) {
     this.id = id;
	this.dept = dept;
	this.name = name;
	this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id= "+id+" name = "+name+"department= "+ dept+" salary = "+salary+" ]"; 
	}
	

}