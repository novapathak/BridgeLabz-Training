package com.bridgelabz.inheritance;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Developer Details ---");
        super.displayDetails();
        System.out.println("Language : " + programmingLanguage);
    }
}
