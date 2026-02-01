package com.bridgelabz.generics.smartwarehousesystem;

public class IPCheck {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        String pattern =
                "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})$";

        System.out.println(ip.matches(pattern));
    }
}
