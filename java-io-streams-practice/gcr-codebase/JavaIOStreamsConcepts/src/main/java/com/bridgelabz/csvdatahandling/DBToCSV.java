package com.bridgelabz.csvdatahandling;

import java.io.*;

class DBToCSV {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("db_report.csv"));

        bw.write("ID,Name,Dept,Salary\n");
        bw.write("1,Amit,IT,50000\n");
        bw.write("2,Riya,HR,45000\n");

        bw.close();
    }
}
