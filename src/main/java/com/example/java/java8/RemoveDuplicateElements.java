package com.example.java.java8;

import java.util.Arrays;
import java.util.List;

//program to remove the duplicate elements
public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ajay", "Ajeet", "Chandan", "Ajay");
        names.stream().distinct().toList().forEach(System.out::println);
    }
}
