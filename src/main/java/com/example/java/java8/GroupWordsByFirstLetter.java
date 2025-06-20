package com.example.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByFirstLetter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("ajeet", "ajay", "chandan", "manoj");
        Map<Character, List<String>> map = findWordsByLetter(names);
        System.out.println(map);
    }

    private static Map<Character, List<String>> findWordsByLetter(List<String> names) {
        return names.stream().collect(Collectors.groupingBy(words -> words.charAt(0)));
    }
}
