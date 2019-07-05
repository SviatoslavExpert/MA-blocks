package com.granovskiy;

public class Dog extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Bark! Bark!");
    }
}
