package com.granovskiy;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
        doSmth(array);
    }

    /* it's very important to make a copy
        of an array before working with it!
        You cannot change the original array.
     */
    private static void doSmth(int[] arr) {
        System.out.println("These are 3 ways of copying arrays.");
        System.out.println();
        //  the 1-st way to copy an array: array iteration
        System.out.print("This is copy1 (the 1-st way of copying): ");
        int[] copy1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy1[i] = arr[i];
            System.out.print(copy1[i]);
        }
        System.out.println();
        System.out.println();

        //  the 2-nd way to copy an array: System.arraycopy();
        System.out.print("This is copy2 (the 2-nd way of copying): ");
        int[] copy2 = new int[arr.length];
        System.arraycopy(arr, 0, copy2, 0, arr.length);
        //  for each is a special kind of loop for working with arrays
        for (int i : copy2) {  //  variable i takes (in turns) values of the array elements
            System.out.print(i);
        }
        System.out.println();
        System.out.print("This is another way of printing array copy2: ");
        System.out.print(Arrays.toString(copy2));
        System.out.println();
        System.out.println();

        //  the 3-d way to copy an array: Arrays.copyOf();
        System.out.print("This is copy3 (the 3-d way of copying): ");
        int[] copy3 = Arrays.copyOf(arr, arr.length);
        System.out.print(Arrays.toString(copy2));

    }
}
