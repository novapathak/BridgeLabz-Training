package com.bridgelabz.reflection;

import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.ArrayList");
        Method[] methods = cls.getDeclaredMethods();
        Field[] fields = cls.getDeclaredFields();
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        for (Field f:fields) {
            System.out.println(f.getName());
        }
        for (Constructor<?> c : constructors) {
            System.out.println(c.getName());
        }
    }
}
