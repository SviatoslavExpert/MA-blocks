package com.granovskiy;

public class Demo {
    public static void main(String[] args) /*throws Exception - the 1-st way*/ {
        Demo demo = new Demo();
        //this is the 2-nd way
        try {
            demo.doSmth();
        } catch (Exception e) {
            //  e.printStackTrace();
            //  or  e.getMessage();
            //  or throw one more Exception
            throw new MyOwnException(e.getMessage());
        } finally {
            System.out.println("From finally.");
        }
    }

    static class MyOwnException extends RuntimeException {
        public MyOwnException (String message) {
            super(message);
        }
    }

    private void doSmth() throws Exception {
        throw new Exception();
    }
}
