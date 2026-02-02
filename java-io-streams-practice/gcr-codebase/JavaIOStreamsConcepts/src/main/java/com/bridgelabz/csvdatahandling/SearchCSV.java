package com.bridgelabz.csvdatahandling;

import java.io.*;

class SearchCSV {

    public static void main(String[] args) throws Exception {
        String searchName = "Amit";
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String line;

        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + data[2]);
                System.out.println("Salary: " + data[3]);
            }
        }
        br.close();
    }
}
