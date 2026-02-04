package com.bridgelabz.streams;

import java.util.*;

public class Sensor {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(20, 45, 60, 30);

        readings.stream()
                .filter(r -> r > 40)
                .forEach(r ->
                    System.out.println("High Reading: " + r)
                );
    }
}
