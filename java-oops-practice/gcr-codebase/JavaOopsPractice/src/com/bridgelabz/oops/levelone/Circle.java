package com.bridgrlabz.oops.levelone;

public class Circle {

    // Variable to store radius
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    void calculateArea() {
        System.out.printf("Area of Circle: %.4f\n", Math.PI * radius * radius);
    }

    // Method to calculate circumference
    void calculateCircumference() {
        System.out.printf("Circumference of Circle: %.4f\n", 2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);

        circle.calculateArea();
        circle.calculateCircumference();
    }
}
