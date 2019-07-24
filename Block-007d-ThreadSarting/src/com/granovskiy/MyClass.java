package com.granovskiy;

public class MyClass implements Runnable {  // 1. Class implements interface Runnable
    public void run() {                     // 2. Class has a method called run()
        System.out.println("MyClass is running.");
    }
}

/*    Thread t1 = new Thread(new MyClass ());
    t1.start();*/
