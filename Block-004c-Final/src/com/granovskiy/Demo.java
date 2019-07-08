package com.granovskiy;

import java.util.ArrayList;
import java.util.List;

public final class Demo {
    /*
      final instance variables must be assigned a value exactly once.
      The assignment can be done via constructor.
      They cannot be reassigned.
     */
    private final List<Integer> list = new ArrayList<>();

    public final int number = 10;

    private final int number2;

    public Demo(int number2) {
        this.number2 = number2;
    }
    //  assignment is done via constructor
}
