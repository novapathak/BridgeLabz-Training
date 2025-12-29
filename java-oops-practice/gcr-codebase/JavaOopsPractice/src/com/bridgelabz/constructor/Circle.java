package com.bridgelabz.constructor;
class Circle {

    double radius;

    // default constructor
    Circle() {
        this(1.0); // calls parameterized constructor
    }

    // parameterized constructor
    Circle(double r) {
        radius = r;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println(c1.radius);
        System.out.println(c2.radius);
    }
}
