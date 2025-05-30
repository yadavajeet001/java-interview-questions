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

        //or
        String reversedString = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed String :"+reversedString);
    }
}
