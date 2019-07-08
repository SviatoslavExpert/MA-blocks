package com.granovskiy;

import static com.granovskiy.Factory.makeNewDemo;
import static com.granovskiy.Factory.makeNewPrinter;

public class Demo {
    Printer printer = makeNewPrinter();

    public static void main(String[] args) {
        Demo demo = makeNewDemo();
        demo.printer.printGreeting("Mike");
    }

}
