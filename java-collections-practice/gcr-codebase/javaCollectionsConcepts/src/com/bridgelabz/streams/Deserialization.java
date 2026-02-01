package com.bridgelabz.streams;

import java.io.*;
import java.util.*;

public class Deserialization {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        try (ObjectInputStream ois =new ObjectInputStream(new FileInputStream("src/com/bridgelabz/streams/input.txt"))) {

            List<Employee> list = (List<Employee>) ois.readObject();

            System.out.println("Employees retrieved from file:");
            for (Employee e:list) {
                System.out.println(e);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found");
        }
    }
}
