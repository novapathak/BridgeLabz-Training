package com.bridgelabz.jsondatahandling;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class StudentJson {
    public static void main(String[] args) throws Exception {

        Map<String, Object> student = new HashMap<>();

        student.put("name", "Rahul");
        student.put("age", 22);

        List<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");

        student.put("subjects", subjects);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(student);

        System.out.println(json);
    }
}
