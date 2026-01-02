package com.bridgelabz.oops.levelone;

class Employee {

    // Instance variables
    String name;
    int id;
    double salary;

    // Constructor to initialize values
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating object
        Employee emp = new Employee("Rohan", 1, 500000);

        // Calling display method
        emp.displayEmployee();
    }
}
