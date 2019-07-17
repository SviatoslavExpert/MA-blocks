package com.granovskiy;

public abstract class Abstract {
    private int number;
    public static final int NUMBER_2 = 10;

    public void setNumber(int number) {
        this.number = number;
    }

    public void doSmth() {
        System.out.println("This is a message from Abstract class.");
    }

    abstract void doSmth2();
}
