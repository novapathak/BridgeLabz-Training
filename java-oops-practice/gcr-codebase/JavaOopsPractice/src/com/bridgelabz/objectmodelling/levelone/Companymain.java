package com.bridgelabz.objectmodelling.levelone;

public class Companymain {

    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee("Rahul");
        dev.addEmployee("Anita");

        Department hr = new Department("HR");
        hr.addEmployee("Suman");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.showCompany();

        // When company object is removed, departments & employees also vanish
        company = null;
        System.out.println("\nCompany deleted → Departments & Employees deleted");
    }
}
