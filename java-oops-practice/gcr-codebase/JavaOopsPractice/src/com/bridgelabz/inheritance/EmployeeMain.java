package com.bridgelabz.inheritance;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e1 = new Manager("Rahul", 101, 75000, 8);
        Employee e2 = new Developer("Anita", 102, 60000, "Java");
        Employee e3 = new Intern("Karan", 103, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
\