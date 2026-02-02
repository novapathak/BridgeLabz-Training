package com.bridgelabz.jsondatahandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IplCsvCensor {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("ipl.csv"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("ipl_censored.csv"));

            String line;

            // Read and write header
            line = reader.readLine();
            writer.write(line);
            writer.newLine();

            // Process data lines
            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                data[1] = maskTeam(data[1]);
                data[2] = maskTeam(data[2]);

                data[6] = "REDACTED";

                writer.write(String.join(",", data));
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("CSV Censorship completed successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String maskTeam(String teamName) {
        String[] parts = teamName.split(" ");
        return parts[0] + " ***";
    }
}
