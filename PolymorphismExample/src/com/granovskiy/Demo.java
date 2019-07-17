package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human();
        Human man = new Man();
        Human woman = new Woman();

        printHuman(human);
        printHuman(man);
        printHuman(woman);
    }

    public static void printHuman(Human human) {
        System.out.println(human.toString());
    }
}

class Human {
    @Override
    public String toString() {
        return "Human{}";
    }
}

class Man extends Human {
    @Override
    public String toString() {
        return "Man{}";
    }
}

class Woman extends Human {
    @Override
    public String toString() {
        return "Woman{}";
    }
}
