package com.bridgelabz.runtimeanalysibigonotation;

public class StringPerformance {

    public static void main(String[] args) {

        int count = 100_000;

       
        long start = System.nanoTime();
        String str = "";
        for (int i = 0; i < count; i++) {
            str += "a";
        }
        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1_000_000.0 + " ms");

      
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1_000_000.0 + " ms");

        
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbf.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
