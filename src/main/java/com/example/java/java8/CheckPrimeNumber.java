package com.example.java.java8;

import java.util.stream.IntStream;

//check the given input is prime number or not
public class CheckPrimeNumber {
    public static void main(String[] args) {

        int num = 17;
        boolean isPrime = isPrime(num);
        System.out.println(isPrime);
    }

    private static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(num) / 2).noneMatch(i -> num % i == 0);
    }
}
