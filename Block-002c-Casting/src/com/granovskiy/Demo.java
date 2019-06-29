package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        System.out.println(10);  //  originally Java understands 10 as int
        //  when printing 10 becomes a string
        System.out.println(0.0); //  originally Java understands 0.0 as double
        System.out.println(0.0d); //  originally Java understands 0.0 as double
        System.out.println(0.0f); //  originally Java understands 0.0 as float

        long number = 10L;
        float number2 = 1.0f;
        System.out.println(10 + 1.5f); // the result will be float -> string

        int someNumber = (int)(10 + 1.9f);
        System.out.println(someNumber); //  the result is 11
    }
}
