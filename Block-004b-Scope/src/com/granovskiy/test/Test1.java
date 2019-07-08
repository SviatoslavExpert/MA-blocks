package com.granovskiy.test;

import com.granovskiy.Scope;

public class Test1 extends Scope {
    public static void main(String[] args) {
        Scope scope = new Scope();
        //System.out.println(scope.number2);   -  doesn't compile, out of scope

        Test1 test1 = new Test1();
        System.out.println(test1.number2); // is seen, because number2 is protected
        //System.out.println(test1.number3);   -  doesn't compile, out of scope
        //System.out.println(test1.number4);   -  doesn't compile, out of scope
    }
}
