package com.bridgelabz.csvdatahandling;

import java.io.*;
import java.util.regex.*;

class ValidateCSV {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("users.csv"));
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        String phoneRegex = "\\d{10}";

        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (!d[2].matches(emailRegex) || !d[3].matches(phoneRegex)) {
                System.out.println("Invalid Row: " + line);
            }
        }
        br.close();
    }
}
