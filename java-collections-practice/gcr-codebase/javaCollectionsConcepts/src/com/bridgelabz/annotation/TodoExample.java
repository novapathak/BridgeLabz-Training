package com.bridgelabz.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

class TodoExample {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Todo {
        String task();
        String assignedTo();
        String priority() default "MEDIUM";
    }

    static class Project {

        @Todo(task = "Login feature", assignedTo = "Nova", priority = "HIGH")
        void login() {}

        @Todo(task = "Payment gateway", assignedTo = "Alex")
        void payment() {}
    }

    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            Todo todo = m.getAnnotation(Todo.class);
            if (todo != null) {
                System.out.println(todo.task() + " | " + todo.assignedTo());
            }
        }
    }
}
