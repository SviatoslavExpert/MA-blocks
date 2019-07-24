package com.granovskiy;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product("iPhone", 1000.00); //  product object created
        List<Product> products = new ArrayList<>();         //  list of projects created
        products.add(product);                              //  product is added to the list
        // the 1-st object is created
        Category category = new Category("Mobile Phones", products); //category object is created

        // the 2-nd object is created
        Category copy = category.clone(); // new copy of Category object is cloned
        copy.setProducts(copy.getProducts().stream()
                .peek(p -> p.setName("another iPhone"))
                .collect(toList()));
        System.out.println(category);
        System.out.println(copy);
    }
}
//    the Stream API is used to process collections of objects
/*
  copy.getProducts() - the products are taken from the product list
  stream()  -  a stream for ArrayList (list of products) is started

  peek() - returns a stream consisting of the elements of this stream, sorted
      according to the provided {@code Comparator}

  toList() - returns a {@code Collector} that accumulates the input elements into a
      new {@code List}.

  collect() - returns the minimum element of this stream according to the provided
     * {@code Comparator}.

  copy.setProducts() - the value obtained (the minimum element) is set in the copy object.

 */
/*
     Method clone()

     1. We implement interface Cloneable:  implements Cloneable

     2. We write method clone():
        a) we override method clone() inside the object:
                @Override
                public Category clone() throws CloneNotSupportedException {}

        b) we create new instance:
            Category copy = (Category) super.clone();

        c) we copy all fields into it:

            List<Product> products = new ArrayList<>(); //  list of products is created

            for (Product p : this.products) {
                products.add(p.clone());      // products are added to the list, object product is copied
            }
            copy.setProducts(products);     // the list is set in the Category object

 */
/*
        for (loop) iteration can be replaced with a stream
 */
