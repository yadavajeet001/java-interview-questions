package com.example.java.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMultipleMissingNumbers {

    //Time: O(n) | Space: O(1) (no additional data structures).
    public static List<Integer> findMissingNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> missing = new ArrayList<>();

        // Mark present numbers by making the value at their index negative
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val <= n) {
                nums[val - 1] = -Math.abs(nums[val - 1]);
            }
        }

        // All indexes still positive -> Missing numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                missing.add(i + 1);
            }
        }

        return missing;
    }

    //Another Approach
    //Time complexity O(n)
    //Space Complexity O(n)
    public static List<Integer> findMissingNumbersWithRange(int[] nums, int range) {
        List<Integer> missing = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= range; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] rolls = {3, 1, 4, 7, 2};
        // Here, range is assumed from 1..7
        int range = 7;

        // To accommodate range > array.length,
        // we must adjust the approach:
        List<Integer> result = findMissingNumbersWithRange(rolls, range);
        System.out.println(result); // Output: [5, 6]
    }


}
