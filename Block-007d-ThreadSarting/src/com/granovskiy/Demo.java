package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyClass());
        t1.start();
    }
}

// implementation of interface Runnable is passed to Thread Class constructor

/*
        3. An instance of MyClass is passed to a Thread
        4. A new thread is created: Thread thread = new Thread()
        5. Method start is called.

        When the thread is started it will call
        the run() method of the MyClass instance
        instead of executing its own run() method.
 */
