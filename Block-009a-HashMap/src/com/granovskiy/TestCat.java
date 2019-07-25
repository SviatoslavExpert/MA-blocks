package com.granovskiy;

public class TestCat {
    private String name;

    public TestCat(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name == null ? 10 : name.hashCode();
    }
}
