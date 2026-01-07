package com.bridgelabz.filereader;

import java.io.*;

class CountWordInFile {

    public static void main(String[] args) throws IOException {
        String word = "java";
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String w : words) {
                if (w.equalsIgnoreCase(word)) {
                    count++;
                }
            }
        }

        br.close();
        System.out.println("Word Count: " + count);
    }
}
