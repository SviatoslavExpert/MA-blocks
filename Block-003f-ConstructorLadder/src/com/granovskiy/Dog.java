package com.granovskiy;

public class Dog extends Animal {
    String name;

    public Dog(int age, String name) {
        super(age);
        this.name = name;
        System.out.println("This is Dog constructor.");
    }
}
