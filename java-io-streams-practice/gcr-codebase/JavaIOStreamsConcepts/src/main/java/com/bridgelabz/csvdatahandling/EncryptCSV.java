package com.bridgelabz.csvdatahandling;

import java.io.*;
import java.util.Base64;

class EncryptCSV {

    public static void main(String[] args) throws Exception {
        String salary = "50000";
        String encrypted = Base64.getEncoder().encodeToString(salary.getBytes());
        String decrypted = new String(Base64.getDecoder().decode(encrypted));

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
