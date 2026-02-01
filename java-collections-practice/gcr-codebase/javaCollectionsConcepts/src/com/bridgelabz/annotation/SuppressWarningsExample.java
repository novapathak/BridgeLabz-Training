package com.bridgelabz.annotation;

import java.util.ArrayList;

class SuppressWarningsExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // raw type
        list.add("Java");
        list.add(10);

        System.out.println(list);
    }
}
