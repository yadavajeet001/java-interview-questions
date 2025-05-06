package com.example.java.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the first repeating character in java 8
public class FindFirstRepeatingCharacter {
    public static void main(String[] args) {
        String name = "Ajeet";
        Character character = name.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        if (character != null) {
            System.out.println("First repeating character : " + character);
        } else {
            System.out.println("No repeating character");
        }

    }
}
