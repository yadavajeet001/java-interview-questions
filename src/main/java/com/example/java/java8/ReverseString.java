package com.example.java.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Reverse the given String
public class ReverseString {
    public static void main(String[] args) {

        String name = "Ajeet";
        List<Character> result = name.chars().mapToObj(c -> (char) c).sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reversed String into character :"+result);

       String result2 = name.chars().mapToObj(c -> (char) c).sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining());
        System.out.println("Reversed String into character 2 :"+result2);

        //or
        String reversedString = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed via String Builder :"+reversedString);
    }
}
