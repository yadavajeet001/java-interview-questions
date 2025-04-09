package com.example.java.array;

//find the missing number from a given array in natural order
public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int length = 8;
        int result = findMissingNumberInArray(arr, length);
        System.out.println(result);
    }

    public static int findMissingNumberInArray(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int j : arr) {
            actualSum += j;
        }
        return totalSum - actualSum;
    }
}
