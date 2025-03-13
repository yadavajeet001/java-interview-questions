package com.example.java.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Takes a string as input.
 * Finds and displays all duplicate characters in the string.
 * Example 1:
 * Input: "programming"
 * Output: Duplicate characters: r, g, m
 * Example 2:
 * Input: "hello"
 * Output: Duplicate characters: l
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        findDuplicateCharacters(str);
    }

    private static void findDuplicateCharacters(String str) {
        boolean duplicateFound = false;
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.print("Duplicate characters: ");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + ", ");
                duplicateFound = true;
            }
        }
        if (!duplicateFound) {
            System.out.println("No duplicate characters.");
        }
    }
}
