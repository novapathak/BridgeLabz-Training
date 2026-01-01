package com.bridgelabz.inheritance;

public class PersonPMain  {

    public static void main(String[] args) {

        Worker w1 = new Chef("Ravi", 101);
        Worker w2 = new Waiter("Amit", 102);

        w1.performDuties();
        w2.performDuties();
    }
}
