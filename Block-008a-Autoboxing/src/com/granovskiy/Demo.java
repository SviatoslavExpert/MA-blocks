package com.granovskiy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // ArrayList with generic, we can add only numbers here
        ArrayList<Integer> arrayList = new ArrayList<>();

        int a = 5;  // primitive type
        Integer integer = 5;  //  object type

        System.out.println(a);
        System.out.println(integer);

        List<String> list = new ArrayList<>();
        list.add("string1");
        list.add("string2");
        list.add("string1");

        HashSet<String> set = new HashSet<>();
        set.add("string1");
        set.add("string2");
        set.add("string1");

        System.out.println(list);
        System.out.println(set);  // set size is 2 (not 3!) because set contains only unique objects


    }
}
