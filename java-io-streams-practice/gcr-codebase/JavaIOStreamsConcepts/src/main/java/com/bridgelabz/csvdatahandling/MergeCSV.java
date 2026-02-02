package com.bridgelabz.csvdatahandling;

import java.io.*;
import java.util.*;

class MergeCSV {

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();

        BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
        br1.readLine();
        String line;
        while ((line = br1.readLine()) != null) {
            String[] d = line.split(",");
            map.put(d[0], line);
        }
        br1.close();

        BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("merged.csv"));
        bw.write("ID,Name,Age,Marks,Grade\n");

        br2.readLine();
        while ((line = br2.readLine()) != null) {
            String[] d = line.split(",");
            if (map.containsKey(d[0])) {
                bw.write(map.get(d[0]) + "," + d[1] + "," + d[2] + "\n");
            }
        }
        br2.close();
        bw.close();
    }
}
