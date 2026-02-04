package com.bridgelabz.markerinterface;
import java.io.Serializable;

class UserData implements Serializable{
	String name;
	int id;
	
	public UserData(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

class Backup{
	
	static void backup(Object obj) {
		if(obj instanceof Serializable) {
			System.out.println("object is eligible for backup");
		}else {
			System.out.println("object is not eligible ");
		}
	}
}
public class Serialization {
public static void main(String[]args) {
	UserData data = new UserData("Nova", 23);
	String normalData = "Nova ";
	Backup.backup(data);
	Backup.backup(normalData);
	
	
}
}
