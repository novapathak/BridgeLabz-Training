package com.bridgelabz.regex;

import java.util.regex.*;

public class CapitalWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";
        String pattern = "\\b[A-Z][a-z]*\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
