package com.bridgelabz.csvdatahandling;

import java.io.*;
import java.util.*;

class DuplicateCSV {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        Set<String> set = new HashSet<>();

        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            String id = line.split(",")[0];
            if (!set.add(id)) {
                System.out.println("Duplicate: " + line);
            }
        }
        br.close();
    }
}