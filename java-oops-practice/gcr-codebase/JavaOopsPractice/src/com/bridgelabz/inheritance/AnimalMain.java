package com.bridgelabz.inheritance;

public class AnimalMain{

    public static void main(String[] args) {

        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Tweety", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
