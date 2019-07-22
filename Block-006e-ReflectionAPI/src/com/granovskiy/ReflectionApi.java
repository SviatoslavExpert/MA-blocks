package com.granovskiy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApi {
    public static void main(String[] args) throws IllegalAccessException{
        Square square = new Square(10);
        Class clazz = square.getClass();

        Method[] methods = clazz.getMethods();
        Field[] fields = clazz.getDeclaredFields();

        /*
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        */

        System.out.println("---------------");


        //  Tips for doing the homework
        for (Field f : fields) {
            f.setAccessible(true);
            System.out.printf("{\n" + "\t" + "\"" + "%s" + "\"" + " : " + "%d" + "\n" + "}", f.getName(), f.get(square));
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

    public String toJson() {
        return "";
    }
}
