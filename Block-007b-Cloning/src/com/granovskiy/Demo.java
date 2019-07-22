package com.granovskiy;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product("iPhone", 1000.00); // created a product
        List<Product> products = new ArrayList<>();  //  created a list of products
        products.add(product);                 //  added product to the list

        // list of products is part of category object
        Category category = new Category("Mobile Phones", products);

        Category copy = (Category) category.clone();

        copy.setProducts(copy.getProducts().stream()
                .peek(p -> p.setName("Another iPhone"))
                .collect(toList()));

        System.out.println(category);
        System.out.println(copy);
    }
}

class Category implements Cloneable {
    private String categoryName;
    private List<Product> products = new ArrayList<>();

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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + products +
                '}';
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
