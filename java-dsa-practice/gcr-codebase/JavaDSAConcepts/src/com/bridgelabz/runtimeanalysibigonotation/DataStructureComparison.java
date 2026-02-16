package com.bridgelabz.runtimeanalysibigonotation;

import java.util.*;

public class DataStructureComparison {

    public static void main(String[] args) {

        int size = 1_000_000;

        List<Integer> array = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = size - 1;

        // Array Search
        long start = System.nanoTime();
        array.contains(target);
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) / 1_000_000.0 + " ms");

        // HashSet Search
        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) / 1_000_000.0 + " ms");

        // TreeSet Search
        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
