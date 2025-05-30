package com.example.java.array;

public class SumOfDigits {
    public static void main(String[] args) {

        int num = 1234;
        System.out.println("Sum Of Digits : " + sumOfDigits(num));
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            //get the last digit
            int digit = num % 10;
            sum += digit;
            //remove the last digit
            num /= 10;
        }
        return sum;
    }
}
