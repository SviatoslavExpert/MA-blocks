package com.granovskiy;

/*
There are 4 kinds of inner classes:
1) Inner class;
2) Nested class;
3) Local member class;
4) Anonymous class.
 */

public class Scope {
    public void doSomethingBig() {

        class LocalMemberClass {
        }
        /*  Anonymous class
        Test test = new Test() {
            @Override
            public void doSmth() {
                System.out.println("Something!");
            }
        };
        */
        //  Anonymous class is replaced with lambda
        //  Nothing in entrance.     This is the output.
        Test testLambda = () -> System.out.println("Lambda option 1!");
        consumeLambda(testLambda);  // Lambda option 1

        consumeLambda(() -> System.out.println("Lambda option 2!"));  //  Lambda option 2

    }

    private void consumeLambda(Test testLambda) {
        testLambda.doSmth();
        InnerClass innerClass = new Scope.InnerClass();
        System.out.println(innerClass.a);
    }

    class InnerClass {
        int a = 50;
    }

    static class NestedClass {
        void printNestedClassBlock() {
            System.out.println("Nested class block.");
        }
    }
}
