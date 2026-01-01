package com.bridgelabz.inheritance;

public class Chef extends PersonP implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}
