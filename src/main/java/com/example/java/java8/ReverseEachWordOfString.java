package com.example.java.java8;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Reverse each word of given string
public class ReverseEachWordOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String input = scanner.nextLine();
        String result = Stream.of(input.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed String : " + result);

    }
}
