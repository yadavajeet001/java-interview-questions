package com.example.java.array;

import java.util.Arrays;

public class ArrayAllPermutation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        findAllPermutation(nums, 0);
    }

    //Time Complexity: O(n·n!) means O(n * n Factorial) — This is inevitable for generating permutations.
    //Space Complexity: O(n) (Recursion depth)
    private static void findAllPermutation(int[] nums, int start) {

        // BASE CASE
        if (start == nums.length - 1) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        // RECURSIVE CASE
        for (int i = start; i < nums.length; i++) {
            // 1️⃣ Swap the element at 'start' with element at 'i'
            swap(nums, start, i);

            // 2️⃣ Recurse for the next position
            findAllPermutation(nums, start + 1);

            // 3️⃣ Backtrack: Swap back to restore the array
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

