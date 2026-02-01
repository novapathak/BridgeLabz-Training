package com.bridgelabz.reflection;

import java.lang.reflect.*;

public class ReflectionAccess {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<?> cls = person.getClass();
        Field field = cls.getDeclaredField("age");

        field.setAccessible(true);
        field.set(person, 25);

        System.out.println(field.get(person));
    }
}
