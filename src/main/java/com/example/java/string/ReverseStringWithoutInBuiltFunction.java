package com.example.java.string;

//Reverse a given string  without using inbuilt function
public class ReverseStringWithoutInBuiltFunction {

    public static void main(String[] args) {
        String str = "hello";
        String result = reverseString(str);
        System.out.println(result);
    }

    private static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
