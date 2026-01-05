package com.bridgelabz.stackqueue.hashmap;

public class CustomHashMapMain {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(1, 10);
        map.put(2, 20);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
}
