package com.example.java.array;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = checkPrimeNumber(num);
        System.out.println(" Palindrome number : " + isPrime);
    }

    private static boolean checkPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num) / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
