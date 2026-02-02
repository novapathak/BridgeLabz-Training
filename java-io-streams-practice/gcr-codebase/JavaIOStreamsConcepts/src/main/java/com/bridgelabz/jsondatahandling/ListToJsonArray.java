package com.bridgelabz.jsondatahandling;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

class Car {
    public String brand;
    public int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

public class ListToJsonArray {

    public static void main(String[] args) {

        try {
            List<Car> cars = new ArrayList<>();

            cars.add(new Car("BMW", 5000000));
            cars.add(new Car("Audi", 6000000));

            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writeValueAsString(cars);

            System.out.println("JSON Array:");
            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
