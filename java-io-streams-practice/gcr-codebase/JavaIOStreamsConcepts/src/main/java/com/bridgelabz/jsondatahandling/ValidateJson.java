package com.bridgelabz.jsondatahandling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJson {

    public static void main(String[] args) {

        try {
            String jsonString = "{\"name\":\"Rahul\",\"age\":22}";

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(jsonString);

            if (root.has("name") && root.has("age")) {
                System.out.println("JSON is VALID");
            } else {
                System.out.println("JSON is INVALID");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
