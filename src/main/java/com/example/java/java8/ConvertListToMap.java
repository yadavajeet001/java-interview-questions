package com.example.java.java8;

import java.util.*;
import java.util.stream.Collectors;

//Convert given list to Map
//Count the frequency of each word
public class ConvertListToMap {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ajeet", "Ajay", "Chandan");

        Map<String, Integer> stringMap = names.stream().collect(Collectors.toMap(name -> name, String::length));
        stringMap.forEach((name, length) -> System.out.println(name + " " + length));

    }
}
