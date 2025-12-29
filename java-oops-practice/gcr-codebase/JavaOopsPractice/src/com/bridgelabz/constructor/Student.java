package com.bridgelabz.constructor;
class Student {

    public int rollNumber;      // public variable
    protected String name;      // protected variable
    private double CGPA;        // private variable

    // setter method for CGPA
    public void setCGPA(double c) {
        CGPA = c;
    }

    // getter method for CGPA
    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {

    // method to display details
    void display() {
        System.out.println(rollNumber + " " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent();
        s.rollNumber = 101;
        s.name = "Rahul";
        s.setCGPA(8.5);

        s.display();
        System.out.println("CGPA: " + s.getCGPA());
    }
}
