package com.bridgelabz.workshop;

import java.util.*;
import java.util.stream.Collectors;

public class SmartCitySystem {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A-B", 30, "08:00"),
                new MetroService("A-C", 50, "08:10"),
                new TaxiService("A-D", 150, "08:05"),
                new Ambulance()
        );

        // 1️⃣ Lambda – Filter cheapest service
        System.out.println("=== Cheapest Services ===");

        services.stream()
                .filter(s -> s.getFare() < 100)
                .sorted((s1, s2) -> Double.compare(s1.getFare(), s2.getFare()))
                .forEach(TransportService::printServiceDetails); // Method Reference


        // 2️⃣ ForEach – Dashboard Live Display
        System.out.println("\n=== Live Dashboard ===");
        services.forEach(TransportService::printServiceDetails);


        // 3️⃣ Functional Interface – Fare Calculator
        FareCalculator calculator =
                (base, distance) -> base + (distance * 5);

        double calculatedFare = calculator.calculateFare(20, 10);
        System.out.println("\nCalculated Fare: " + calculatedFare);


        // 4️⃣ Static Method – Distance Calculation
        double distance = GeoUtils.calculateDistance(10, 20, 15, 25);
        System.out.println("Distance Calculated: " + distance);


        // 5️⃣ Stream API + Collectors
        List<Passenger> passengers = Arrays.asList(
                new Passenger("Amit", "A-B", 30, true),
                new Passenger("Riya", "A-B", 30, false),
                new Passenger("John", "A-C", 50, true),
                new Passenger("Sara", "A-D", 150, true)
        );

        // Grouping by Route
        System.out.println("\n=== Grouped by Route ===");
        Map<String, List<Passenger>> grouped =
                passengers.stream()
                        .collect(Collectors.groupingBy(Passenger::getRoute));

        grouped.forEach((route, list) ->
                System.out.println(route + " -> " + list.size() + " passengers"));

        // Partitioning Peak vs Non-Peak
        System.out.println("\n=== Peak vs Non-Peak ===");
        Map<Boolean, List<Passenger>> partitioned =
                passengers.stream()
                        .collect(Collectors.partitioningBy(Passenger::isPeakTime));

        System.out.println("Peak: " + partitioned.get(true).size());
        System.out.println("Non-Peak: " + partitioned.get(false).size());

        // Revenue Summary
        System.out.println("\n=== Revenue Summary ===");
        DoubleSummaryStatistics stats =
                passengers.stream()
                        .collect(Collectors.summarizingDouble(Passenger::getFare));

        System.out.println("Total Revenue: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());


        // 6️⃣ Marker Interface Detection
        System.out.println("\n=== Emergency Detection ===");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s ->
                        System.out.println(s.getServiceName() + " is prioritized!"));
    }
}
