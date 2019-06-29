package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        //  primitives are copied by value
        int a = 10;
        int b = a;
        b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        //  references pointing to the same object
        Cat cat = new Cat("vaska", 3);
        Cat cat1 = cat; // 2 references point to the same object
        cat1.age = 4;
        System.out.println("cat age is:" + cat.age);
        System.out.println("cat1 age is:" + cat1.age);
        System.out.println();
        //  calling the method that changes field value
        Cat cat2;
        cat2 = doSmth(cat);
        System.out.println("cat age is:" + cat.age);
        System.out.println("cat1 age is:" + cat1.age);
        System.out.println("cat2 age is:" + cat2.age);
        System.out.println();
        //  calling the method makeNewCatObject
        Cat cat3;
        cat3 = makeNewCatObject(cat);
        System.out.println("cat age is:" + cat.age);
        System.out.println("cat1 age is:" + cat1.age);
        System.out.println("cat2 age is:" + cat2.age);
        System.out.println("cat3 age is:" + cat3.age);  //  only cat3's age changed

    }

    private static Cat doSmth(Cat cat) {
        cat.age = 5; //  object's field value is changed
        return cat;
    }

    private static Cat makeNewCatObject(Cat cat) {
        cat = new Cat("Tom", 7);
        return cat;
    }

    static class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
