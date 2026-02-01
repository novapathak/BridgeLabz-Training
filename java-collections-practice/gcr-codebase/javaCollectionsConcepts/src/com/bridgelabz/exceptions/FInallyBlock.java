package com.bridgelabz.exceptions;

import java.util.*;

public class FInallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}



