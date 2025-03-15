package com.example.java.string;

/**
 * Takes a string as input.
 * Finds and displays all the permutations of that string.
 * Example 1:
 * Input: "ABC"
 * Output: ABC, ACB, BAC, BCA, CAB, CBA
 * Example 2:
 * Input: "AB"
 * Output: AB, BA
 */
public class FindAllPermutation {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of the given string: ");
        findAllPermutation(str, "");
    }

    private static void findAllPermutation(String str, String prefix) {

        //If the string is empty, print the prefix
        if (str.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Form the remaining string after removing the character at index i
                String remaining = str.substring(0, i) + str.substring(i + 1);

                // Recurse with the remaining string and the prefix updated with the chosen character
                findAllPermutation(remaining, prefix + ch);
            }
        }
    }
}
