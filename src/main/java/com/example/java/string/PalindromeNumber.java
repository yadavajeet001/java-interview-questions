package com.example.java.string;

/**
 * Takes a string as input.
 * Checks if the string is a palindrome.
 * Displays the result indicating whether the string is a palindrome.
 * Example 1:
 * Input: "madam"
 * Output: "madam" is a palindrome.
 * Example 2:
 * Input: "hello"
 * Output: "hello" is not a palindrome.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        String str = "madam";
        boolean result = isPalindrome(str);
        System.out.println("\"" + str + "\" is " + (result ? "a palindrome." : "not a palindrome."));
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
