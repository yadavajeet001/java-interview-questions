package com.example.java.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string, the task is to find the first character that does not repeat
 * in the entire string. If no such character exists, the program should indicate that
 * no non-repeated character was found.
 * Example 1:
 * Input: "swiss"
 * Output: 'w' (The first non-repeated character is 'w')
 * Example 2:
 * Input: "programming"
 * Output: 'p' (The first non-repeated character is 'p')
 * Example 3:
 * Input: "aabbcc"
 * Output: No non-repeated character found.
 */
public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatedCharacter(str);
        System.out.println(result == '\0' ? "No non-repeated character found." : "First non-repeated character is: " + result);
    }

    private static char firstNonRepeatedCharacter(String str) {

        //LinkedHashMap maintains the order of insertion
        Map<Character, Integer> map = new LinkedHashMap<>();

        //Iterate over the string and store the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //Iterate over the map and return the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        //If no such character exists, return null character
        return '\0';
    }
}
