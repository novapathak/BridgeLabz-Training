package com.bridgelabz.csvdatahandling;

import java.io.*;
import java.util.*;

class CSVToObject {

    static class Student {
        int id;
        String name;
        int age;

        Student(int i, String n, int a) {
            id = i; name = n; age = a;
        }

        public String toString() {
            return id + " " + name + " " + age;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        List<Student> list = new ArrayList<>();

        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            list.add(new Student(
                    Integer.parseInt(d[0]), d[1], Integer.parseInt(d[2])));
        }
        br.close();

        list.forEach(System.out::println);
    }
}
