package com.example.java.string;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println("Is Palindrome : "+checkPalindromeString(str));
    }

    private static Boolean checkPalindromeString(String str) {
        int left = 0;
        int right = str.length() - 1;
        for (int i = left; i < right; i++) {
            if (str.charAt(i) != str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
