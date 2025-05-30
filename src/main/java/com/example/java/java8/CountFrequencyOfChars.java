package com.example.java.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//count the frequency of every character in the given string
public class CountFrequencyOfChars {
    public static void main(String[] args) {

        String names = "Ajay Ajeet Chandan";

        System.out.println("-------count frequency of repeating characters-----");
        Map<Character, Long> map = names.chars().filter(c -> c != ' ')
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((character, count) -> System.out.println(character + "->" + count));

        System.out.println("-------count frequency of only repeating characters-----");
        Map<Character, Long> repeatedCharCount = names.chars().filter(c -> c != ' ')
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        repeatedCharCount.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach((System.out::println));

        String names2 = "Ajay, Ajeet, Chandan";
        System.out.println("-------------second way to count frequency of all character------------");
        Map<Character, Long> frequencyCount = names2.chars().map(Character::toLowerCase).filter(c -> c != ',' && c != ' ')
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequencyCount.forEach((character, aLong) -> System.out.println(character + "->" + aLong));


    }
}
