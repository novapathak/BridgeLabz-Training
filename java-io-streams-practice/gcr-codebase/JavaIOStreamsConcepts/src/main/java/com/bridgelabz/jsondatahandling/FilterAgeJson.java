package com.bridgelabz.jsondatahandling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterAgeJson {

    public static void main(String[] args) {

        try {
            String jsonArray =
                    "[{\"name\":\"Amit\",\"age\":30}," +
                    "{\"name\":\"Ravi\",\"age\":22}," +
                    "{\"name\":\"Neha\",\"age\":28}]";

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(jsonArray);

            System.out.println("People with age > 25:");

            for (JsonNode node : root) {
                int age = node.get("age").asInt();

                if (age > 25) {
                    System.out.println(node);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
