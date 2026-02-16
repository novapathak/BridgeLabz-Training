package com.bridgelabz.designpattern.librarymanagement;

public class Librarian extends User {

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void getRole() {
        System.out.println(name + " is Librarian (Inventory Manager)");
    }
}
