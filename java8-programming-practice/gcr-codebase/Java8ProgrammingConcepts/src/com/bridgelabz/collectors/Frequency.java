package com.bridgelabz.collectors;
import java.util.*;
import java.util.stream.*;
public class Frequency {
	 public static void main(String[] args) {

 String paragraph = "java is easy and java is powerful";
 String[] words = paragraph.split(" ");
 
 Map<String, Integer> wordCount = Arrays.stream(words)
		 .collect(Collectors.toMap(word -> 
		 word,word ->1,(oldValue, newValue)-> oldValue + newValue));
 wordCount.forEach((word, count) ->
 System.out.println(word + " : " + count)
);
}
}
