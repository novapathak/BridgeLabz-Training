package com.bridgelabz.stringbuffer;

class ConcatenateUsingStringBuffer {

    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "powerful"};

        StringBuffer sb = new StringBuffer();

        for (String s : words) {
            sb.append(s);
        }

        System.out.println("Concatenated String: " + sb.toString());
    }
}
