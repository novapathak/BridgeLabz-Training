package com.bridgelabz.dsa.day07.eduresult;

public class Student {
	
	private String name;
	private int score;
	private String district;
	
	public Student(String name, int score, String district) {
		this.name = name;
		this.score = score;
		this.district = district;
	}
	
	public int getMarks() {
		return score;
	}
	
  @Override
  public String toString() {
      return name + " | " + score + " | " + district;
  }

	
	

}
