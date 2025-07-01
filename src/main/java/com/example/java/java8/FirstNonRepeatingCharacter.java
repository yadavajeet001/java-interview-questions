package com.example.java.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String name = "aajeet";
        Character character = name.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(Character::charValue, v -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);

        if (character != null) {
            System.out.println("First non repeating character : " + character);
        } else {
            System.out.println("No non repeating character");
        }

        //Another way
        Character firstNonRepeatingChar = name.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse(null);

        if (firstNonRepeatingChar != null) {
            System.out.println("First non repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non repeating character");
        }
    }
}
