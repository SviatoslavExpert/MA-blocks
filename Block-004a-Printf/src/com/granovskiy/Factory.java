package com.granovskiy;

public class Factory {
    public static Printer makeNewPrinter() {
        return new Printer();
    }

    public static Demo makeNewDemo() {
        return new Demo();
    }

}
