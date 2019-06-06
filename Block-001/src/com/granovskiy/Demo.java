package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 3);  // bad practice
        Cat cat2 = Cat.of("Tom", 2);     //  good practice
    }
}
