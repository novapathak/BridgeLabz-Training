package com.bridgelabz.annotation;

class OverrideExample {

    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
