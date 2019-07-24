package com.granovskiy;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product("iPhone", 1000.00); // created a product object
        List<Product> products = new ArrayList<>();  //  created a list of products
        products.add(product);                       //  added the product to the list

        // list of products is part of category object
        Category category = new Category("Mobile Phones", products);

        Category copy = category.clone();
        copy.setProducts(copy.getProducts().stream()
                .peek(p -> p.setName("Another iPhone"))
                .collect(toList()));
        System.out.println(category);
        System.out.println(copy);
    }
}
