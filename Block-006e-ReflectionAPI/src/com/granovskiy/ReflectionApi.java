package com.granovskiy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApi {
    public static void main(String[] args) {
        Square square = new Square(10);
        Class clazz = square.getClass();

        Method[] methods = clazz.getMethods();
        Field[] fields = clazz.getDeclaredFields();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

        System.out.println("---------------");

        for (Field f : fields) {
            System.out.println(f.getName());
        }

        //  Tips for doing the homework
        for (Field f : fields) {
            System.out.println("{\n" + "\t" + "\"" + f.getName() + "\"" + " : " + "null" + "\n" + "}");
        }


        // How to get value from a field using Reflection API ?
        
    }

}

class Square {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
