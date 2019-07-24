package com.granovskiy;

import java.util.ArrayList;
import java.util.List;

public class Category implements Cloneable {
    private String categoryName;
    private List<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(String categoryName, List<Product> products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Category clone() throws CloneNotSupportedException {
        List<Product> products = new ArrayList<>();
        for (Product p : this.products) {
            products.add(p.clone());
        }
        return new Category(categoryName, products);
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + products +
                '}';
    }
}

