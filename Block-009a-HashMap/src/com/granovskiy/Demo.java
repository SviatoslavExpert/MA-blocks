package com.granovskiy;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<TestCat, String> map = new HashMap<>();

        TestCat t1 = new TestCat(null);
        TestCat t2 = new TestCat(null);
        TestCat t3 = new TestCat(null);

        t2 = t1;
        t3 = t1;

        map.put(t1, "1");
        map.put(t2, "2");
        map.put(t3, "3");
        map.put(new TestCat("test"), "4");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println();
        System.out.println(map.get(t1) + " hashCode: " + t1.hashCode());
        System.out.println(map.get(t2) + " hashCode: " + t2.hashCode());
        System.out.println(map.get(t3) + " hashCode: " + t3.hashCode());
    }
}
