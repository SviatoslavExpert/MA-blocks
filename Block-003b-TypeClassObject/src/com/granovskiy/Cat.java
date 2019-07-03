package com.granovskiy;

abstract class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Cat extends Animal {
    String name;

    public Cat(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal cat = new Cat(3, "Vaska");

        ((Cat) cat).getName();

        printAnimal(cat);
    }

    private static void printAnimal(Animal animal) {
        System.out.println(animal);
    }
}


