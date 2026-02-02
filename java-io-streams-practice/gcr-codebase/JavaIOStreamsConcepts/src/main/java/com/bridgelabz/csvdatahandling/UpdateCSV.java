package com.bridgelabz.csvdatahandling;

import java.io.*;

class UpdateCSV {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated_employees.csv"));
        String line;

        bw.write(br.readLine() + "\n");

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[2].equals("IT")) {
                double salary = Double.parseDouble(d[3]);
                d[3] = String.valueOf(salary * 1.1);
            }
            bw.write(String.join(",", d) + "\n");
        }
        br.close();
        bw.close();
    }
}
