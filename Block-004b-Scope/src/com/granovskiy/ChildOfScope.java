package com.granovskiy;

public class ChildOfScope extends Scope {
    public static void main(String[] args) {
        Scope scope = new Scope();
        System.out.println(scope.number2);
        System.out.println(scope.number3);
        //System.out.println(scope.number4);   -  doesn't compile, out of scope
    }
}
