package com.bridgelabz.regex;

import java.util.regex.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, JavaScript and Go";
        String pattern = "\\b(Java|Python|JavaScript|Go)\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
