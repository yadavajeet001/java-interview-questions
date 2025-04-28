package com.example.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The filter() method is used to keep only those elements that satisfy a given condition.
 * It’s a powerful way to apply logic directly to a stream without needing an if-condition or manual removal.
 */
public class FilterMethod {
    public static void main(String[] args) {

        //collect(Collectors.toList()) - java 8
        //toList() - java 16
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> filterResult = arrayList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(filterResult);

        List<String> languages = Arrays.asList("Java", "C", "Python");
        List<String> resultLanguages = languages.stream().filter(language -> !language.equals("C")).toList();
        System.out.println(resultLanguages);

        //list of product with price > 25k
        List<Product> products = new ArrayList<>();
        products.add(new Product("Adidas shoes", 30000d));
        products.add(new Product("Puma shoes", 20000d));
        products.add(new Product("Nike shoes", 35000d));
        products.add(new Product("Sketcher shoes", 40000d));

        List<String> productName = products.stream().filter(product -> product.price > 25000d).map(Product::getProductName).toList();
        productName.forEach(System.out::println);

        products.stream().filter(product -> product.price > 25000d).toList().forEach(System.out::println);

    }
}
