package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        String name = "Alex";
        String name2 = "Alex";
        // 2 references point to the same object in the string pool
        System.out.print("2 references point to the same object in the string pool: ");
        System.out.println(name == name2); // comparing the references returns true

        String name3 = new String("Alex"); // this string is in Heap, not in String pool
        System.out.print("2 references point to different objects: ");
        System.out.println(name == name3);

        // this is bad practice
        String name5 = new String("Alex").intern(); // new String was put in the String pool
        System.out.print("2 references point to the same object in the string pool: ");
        System.out.println(name == name5);
    }
}
