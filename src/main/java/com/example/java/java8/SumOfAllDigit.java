package com.example.java.java8;

//Find the sum of all digit
public class SumOfAllDigit {
    public static void main(String[] args) {

        int num = 12345;
        int result = String.valueOf(num).chars().map(Character::getNumericValue).sum();
        System.out.println(result);
    }
}
