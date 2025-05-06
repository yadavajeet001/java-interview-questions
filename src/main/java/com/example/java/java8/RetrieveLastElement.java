package com.example.java.java8;

import java.util.Arrays;
import java.util.List;

//Program to retrieve the last element from the list
public class RetrieveLastElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ajeet", "Ajay", "Chandan");
        names.stream().reduce((first, second) -> second).ifPresent(System.out::println);
    }
}
