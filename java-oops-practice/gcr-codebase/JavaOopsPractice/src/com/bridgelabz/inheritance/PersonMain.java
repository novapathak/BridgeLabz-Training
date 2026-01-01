package com.bridgelabz.inheritance;

public class PersonMain  {

    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Maths");
        Person p2 = new Student("Amit", 16, "10th");
        Person p3 = new Staff("Ramesh", 45, "Administration");

        ((Teacher)p1).displayRole();
        System.out.println();

        ((Student)p2).displayRole();
        System.out.println();

        ((Staff)p3).displayRole();
    }
}
