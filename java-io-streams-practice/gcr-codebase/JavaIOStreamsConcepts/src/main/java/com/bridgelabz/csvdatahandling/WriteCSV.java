package com.bridgelabz.csvdatahandling;
import java.io.*;

class WriteCSV {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Amit,IT,50000\n");
        bw.write("2,Riya,HR,45000\n");
        bw.write("3,Karan,IT,60000\n");
        bw.write("4,Neha,Finance,55000\n");
        bw.write("5,Rahul,IT,70000\n");

        bw.close();
        System.out.println("CSV written successfully");
    }
}
