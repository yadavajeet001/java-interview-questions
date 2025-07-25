package com.example.java.java8;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the first repeating character in java 8
public class FindFirstRepeatingCharacter {
    public static void main(String[] args) {
        String name = "Ajeet";
        Character character = name.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Character::charValue, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        if (character != null) {
            System.out.println("First repeating character : " + character);
        } else {
            System.out.println("No repeating character");
        }

        //Another Optimize way
        Set<Character> seen = new HashSet<>();

        Character firstRepeating = name.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> !seen.add(ch))  // add returns false if already seen
                .findFirst()
                .orElse(null);

        if (firstRepeating != null) {
            System.out.println("First repeating character: " + firstRepeating);
        } else {
            System.out.println("No repeating character");
        }
    }
}

