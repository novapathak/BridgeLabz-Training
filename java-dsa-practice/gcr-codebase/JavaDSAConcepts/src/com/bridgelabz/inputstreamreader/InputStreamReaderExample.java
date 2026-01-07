package com.bridgelabz.inputstreamreader;

import java.io.*;

class InputStreamReaderExample {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr =
                new InputStreamReader(new FileInputStream("sample.txt"), "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
