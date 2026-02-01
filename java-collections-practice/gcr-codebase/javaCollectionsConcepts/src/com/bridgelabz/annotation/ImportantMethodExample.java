package com.bridgelabz.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

class ImportantMethodExample {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface ImportantMethod {
        String level() default "HIGH";
    }

    static class Service {

        @ImportantMethod
        void task1() {}

        @ImportantMethod(level = "LOW")
        void task2() {}
    }

    public static void main(String[] args) {
        for (Method m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " → " + im.level());
            }
        }
    }
}
