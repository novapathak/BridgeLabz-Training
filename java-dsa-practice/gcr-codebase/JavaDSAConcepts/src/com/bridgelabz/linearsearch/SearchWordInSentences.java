package com.bridgelabz.linearsearch;

class SearchWordInSentences {

    public static void main(String[] args) {
        String[] sentences = {
                "Java is fun",
                "I love coding",
                "Binary search is fast"
        };

        String word = "coding";
        String result = "Not Found";

        for (String s : sentences) {
            if (s.contains(word)) {
                result = s;
                break;
            }
        }

        System.out.println(result);
    }
}
