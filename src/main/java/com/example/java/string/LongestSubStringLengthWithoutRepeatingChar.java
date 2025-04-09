package com.example.java.string;

import java.util.HashMap;
import java.util.Map;

//Find the longest substring length without repeating character in a given string
public class LongestSubStringLengthWithoutRepeatingChar {

    public static void main(String[] args) {
        String str = "abcabcaa";
        System.out.println("Longest subString length : " + findLongestSubStringLengthWithoutRepeatingChar(str));
    }

    private static int findLongestSubStringLengthWithoutRepeatingChar(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int maxLength = 0;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int i = 0, j = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (characterIntegerMap.containsKey(currentChar)) {
                j = Math.max(j, characterIntegerMap.get(currentChar) + 1);
            }

            characterIntegerMap.put(currentChar, i);
            maxLength = Math.max(maxLength, i - j + 1);

        }
        return maxLength;
    }
}
