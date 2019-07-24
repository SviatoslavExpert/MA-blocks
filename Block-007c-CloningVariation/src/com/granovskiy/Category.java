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
        Category copy = (Category) super.clone();  //a copy of the object is created
        List<Product> products = new ArrayList<>(); //  list of products is created

        for (Product p : this.products) {
            products.add(p.clone());      // products are added to the list, object product is copied
        }
        copy.setProducts(products);     // the list is set in the Category object
        return copy;   // object containing list of products with new product object inside

    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + products +
                '}';
    }
}
