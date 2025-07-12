package com.example.java.array;

import java.util.List;
import java.util.stream.IntStream;

public class FindPrimeNumberInRange {

    public static void main(String[] args) {
        int input = 10;

        List<Integer> primes = IntStream.rangeClosed(2, input)
                .filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch(divisor -> n % divisor == 0))
                .boxed()
                .toList();

        System.out.println("Prime numbers from 1 to " + input + ": " + primes);
    }
}

