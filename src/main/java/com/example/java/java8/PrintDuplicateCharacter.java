package com.example.java.java8;

import java.util.function.Function;
import java.util.stream.Collectors;

//print the duplicate character
public class PrintDuplicateCharacter {
    public static void main(String[] args) {
        String name = "ajeett";
        name.chars()
                .mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach((res -> System.out.println("duplicate character :" + res)));
    }
}
