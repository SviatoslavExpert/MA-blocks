package com.granovskiy;

/*
    Overriding rules
    1. Method signature should be the same: voice()
    2. Access modifier should be the same or wider: public
    3. Type of the value returned should be the same: void
    4. Exception type should be the same or covariant.
 */

public class Cat extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Meow! Meow!");
    }
}
