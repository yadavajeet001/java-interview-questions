package com.example.java.array;

import java.util.Optional;
import java.util.stream.IntStream;

public class FindPrimePair {

    public static void main(String[] args) {
        int number = 34;
        int[] pair = findPrimePair(number);
        if (pair != null) {
            System.out.println(number + " = " + pair[0] + " + " + pair[1]);
        } else {
            System.out.println("No prime pair found for " + number);
        }

        //By Using java 8
        Optional<int[]> pair2 = findPrimePair2(number);

        pair2.ifPresentOrElse(
                p -> System.out.println(number + " = " + p[0] + " + " + p[1]),
                () -> System.out.println("No prime pair found for " + number)
        );

        //By Using java 8
        Optional<int[]> pair3 = findPrimePair3(number);

        pair3.ifPresentOrElse(
                p -> System.out.println(number + " = " + p[0] + " + " + p[1]),
                () -> System.out.println("No prime pair found for " + number)
        );
    }

    //Time Complexity - O(n√n)
    //Space Complexity - O(1)
    // Function to find a prime pair that adds up to num
    public static int[] findPrimePair(int num) {
        for (int i = 2; i <= num / 2; i++) {
            int j = num - i;
            if (isPrime(i) && isPrime(j)) {
                return new int[]{i, j};
            }
        }
        return null;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //By Using java 8
    public static Optional<int[]> findPrimePair2(int num) {
        return IntStream.rangeClosed(2, num / 2)
                .filter(i -> isPrime2(i) && isPrime2(num - i))
                .mapToObj(i -> new int[]{i, num - i})
                .findFirst();
    }

    public static boolean isPrime2(int n) {
        if (n < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }

    //By Using reduce
    public static Optional<int[]> findPrimePair3(int num) {
        return IntStream.rangeClosed(2, num / 2)
                .filter(i -> isPrime3(i) && isPrime3(num - i))
                .mapToObj(i -> new int[]{i, num - i})
                .reduce((first, second) -> first);
    }

    public static boolean isPrime3(int n) {
        if (n < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }

}
