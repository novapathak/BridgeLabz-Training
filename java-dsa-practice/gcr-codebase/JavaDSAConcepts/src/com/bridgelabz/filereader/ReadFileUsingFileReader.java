package com.bridgelabz.filereader;
import java.io.*;

class ReadFileUsingFileReader {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("sample.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
