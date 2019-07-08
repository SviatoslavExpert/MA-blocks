package com.granovskiy;

public class Scope {
    public int number1;
    protected int number2 = 11;
    int number3 = 101;
    private int number4;

    /*
    Parameter is variable in the declaration of function.
    Argument is the actual value of this variable that gets passed to function.
     */

    public static void doSmth(int number6) {
        int number7 = 20;
        //System.out.println(name);   -  doesn't compile, out of scope
        if (number6 > number7) {
            String name = "Tom";
            System.out.println(name);
        } else {
            String name2 = "Mike";
            System.out.println(name2);
        }
        //System.out.println(name);   -  doesn't compile, out of scope

        for (int i = 0; i < number6; i++) {
            int number8 = i;
            System.out.print(number8);
        }
        //System.out.println(number8);   -  doesn't compile, out of scope

        int number9 = number7;
        System.out.println();
        System.out.println(number9);
    }

}
