package com.example.java.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Given string as input
 * create substring from first character of each word
 * check that new string is palindrome or not
 */
public class CheckPalindromeByCreatingNewString {
    public static void main(String[] args) {
        String input = "my name is ajeet and i am interviewing at western union";

        String word = Arrays.stream((input.trim().split("\\s")))
                .map(w -> w.substring(0, 1))
                .collect(Collectors.joining());
        System.out.println("new string word:" + word);

        boolean isPalindrome = new StringBuilder(word).reverse().toString().equals(word);
        System.out.println("isPalindrome :" + isPalindrome);
    }
}
