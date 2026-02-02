package com.bridgelabz.csvdatahandling;

import java.io.*;

class JsonCsv {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.csv"));
        bw.write("ID,Name\n1,Nova\n2,Amit\n");
        bw.close();
    }
}
