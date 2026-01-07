package com.bridgelabz.stringbuilder;

import java.util.HashSet;

class RemoveDuplicate {

    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }

        System.out.println("Without Duplicates: " + result);
    }
}
