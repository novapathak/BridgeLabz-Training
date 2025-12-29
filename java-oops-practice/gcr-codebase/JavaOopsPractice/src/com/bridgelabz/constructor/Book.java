package com.bridgelabz.constructor;
class Book {

    public String ISBN;        // public variable
    protected String title;    // protected variable
    private String author;     // private variable

    // setter for author
    public void setAuthor(String a) {
        author = a;
    }

    // getter for author
    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    // method to display data
    void display() {
        System.out.println(ISBN + " " + title);
    }

    public static void main(String[] args) {
        EBook b = new EBook();
        b.ISBN = "1234";
        b.title = "Java Basics";
        b.setAuthor("James");

        b.display();
        System.out.println("Author: " + b.getAuthor());
    }
}
