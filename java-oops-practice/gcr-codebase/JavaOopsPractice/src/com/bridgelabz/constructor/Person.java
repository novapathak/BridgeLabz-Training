package com.bridgelabz.constructor;
class Person {

    String name;
    int age;

    // parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aman", 20);
        Person p2 = new Person(p1);

        System.out.println(p2.name + " " + p2.age);
    }
}
