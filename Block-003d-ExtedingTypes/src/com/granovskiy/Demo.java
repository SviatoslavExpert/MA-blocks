package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        overloaded1(7);
        overloaded2(5);
        overloaded3(3,4,5);
        overloaded4(3);
        overloaded5(3);
        overloaded6(3);
        overloaded7(3);
        overloaded8(3);
    }
    /*
    private static void overloaded(int number) {
        System.out.println("This is int.");
    }
    */
    private static void overloaded1(long number) {
        System.out.println("Long is here because int is extended to long. There is no other option here.");
    }
    //  out of all overloaded methods the closest type is called
    //  overloaded1 method:  long is closer to int than Integer
    private static void overloaded2(long number) {
        System.out.println("Long is here because long is closer to int than Integer (wrapper).");
    }

    private static void overloaded2 (Integer number) {
        System.out.println("This is Integer.");
    }

    // overloaded3() vararg (which is an object) can work with many arguments
    private static void overloaded3(int ... number) {
        System.out.println("Vararg (int) can work with many arguments.");
    }

    private static void overloaded4(Object number) {
        System.out.println("It can work with an object.");
    }

    private static void overloaded5(Object ... number) {
        System.out.println("Vararg (object) can work with many objects (arguments).");
    }

    // overloaded6(): Float is here because float is closer to int than Integer (wrapper).
    private static void overloaded6(float number) {
        System.out.println("Float is here because float is closer to int than Integer (wrapper).");
    }

    private static void overloaded6(Integer number) {
        System.out.println("Integer (wrapper).");
    }

    // overloaded7(): Integer (wrapper) is here because Integer (wrapper) is closer to int than Object.
    private static void overloaded7(Object number) {
        System.out.println("Object.");
    }

    private static void overloaded7(Integer number) {
        System.out.println("Integer (wrapper) is here because Integer (wrapper) is closer to int than Object.");
    }

    /* overloaded8():
        Object is here because Long will not work at all:
        double extension doesn't work: 1 - to long; 2 - to Long (wrapper).
     */
    private static void overloaded8(Object number) {
        System.out.println("Object is here because Long will not work at all: double extension doesn't work: 1 - to long; 2 - to Long (wrapper).");
    }

    private static void overloaded8(Long number) {
        System.out.println("Long (wrapper).");
    }


}
