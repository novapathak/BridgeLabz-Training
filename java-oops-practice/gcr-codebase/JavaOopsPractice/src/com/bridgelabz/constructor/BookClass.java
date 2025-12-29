package com.bridgelabz.constructor;
class Book1 {

    String title, author;
    double price;

    // default constructor
    Book1() {
        title = "NA";
        author = "NA";
        price = 0;
    }

    // parameterized constructor
    Book1(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public static void main(String[] args) {
        Book1 b1 = new Book1();
        Book1 b2 = new Book1("Java", "James", 500);

        System.out.println(b1.title);
        System.out.println(b2.title);
    }
}
