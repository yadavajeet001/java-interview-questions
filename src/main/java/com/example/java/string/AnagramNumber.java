package com.example.java.string;

import java.util.Arrays;

public class AnagramNumber {
    public static void main(String[] args) {
        String s1 = "silent listen";
        String s2 = "listen listen";
        System.out.println(checkAnagram(s1, s2));
    }

    private static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        char[] ch = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        return Arrays.equals(ch, ch2);
    }
}
