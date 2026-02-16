package com.bridgelabz.designpattern.librarymanagement;

public abstract class User {

    protected String name;

    public User(String name) {
        this.name = name;
    }

    public abstract void getRole();
}
