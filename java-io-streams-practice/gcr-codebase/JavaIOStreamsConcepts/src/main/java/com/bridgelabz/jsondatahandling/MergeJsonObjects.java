package com.bridgelabz.jsondatahandling;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;

public class MergeJsonObjects {

    public static void main(String[] args) {

        try {
            // First JSON object
            Map<String, Object> json1 = new HashMap<>();
            json1.put("name", "Amit");

            // Second JSON object
            Map<String, Object> json2 = new HashMap<>();
            json2.put("age", 25);

            // Merge json2 into json1
            json1.putAll(json2);

            ObjectMapper mapper = new ObjectMapper();
            String mergedJson = mapper.writeValueAsString(json1);

            System.out.println("Merged JSON:");
            System.out.println(mergedJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
