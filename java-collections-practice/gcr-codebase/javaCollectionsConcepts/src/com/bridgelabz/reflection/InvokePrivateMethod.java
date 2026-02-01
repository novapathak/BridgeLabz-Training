package com.bridgelabz.reflection;

import java.lang.reflect.*;

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        Object result = method.invoke(calculator, 4, 5);
        System.out.println(result);
    }
}
