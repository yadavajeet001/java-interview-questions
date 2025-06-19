package com.example.java.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Find the longest substring length without repeating character in a given string
public class LongestSubStringLengthWithoutRepeatingChar {

    public static void main(String[] args) {
        String str = "abcabcaa";
        System.out.println("Longest subString length1 : " + findLongestSubStringLengthWithoutRepeatingChar(str));
        System.out.println("Longest substring length2 : " + lengthOfLongestSubstring(str));
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

    //Time Complexity - O(n) as right traverse loop once and left traverse less than right
    //Space complexity - O(1) for fixed character and O(n) for variable or large input
    //sliding window pattern
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }


}