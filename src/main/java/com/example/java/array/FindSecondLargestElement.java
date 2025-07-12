package com.example.java.array;

import java.util.TreeSet;

public class FindSecondLargestElement {

    public static void main(String[] args) {

        //Time Complexity - O(n)
        //Space Complexity - O(1)
        int[] arr = {12, 36, 3, 5, 5, 4, 4,35, 45};
        Integer result = findSecondLargestUsingTreeSet(arr);
        System.out.println("Using TreeSet :" + result);
        int largest = 0, secondLargest = 0;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);

    }

    private static Integer findSecondLargestUsingTreeSet(int[] arr) {
        //Another Approach
        //Time Complexity - O(n log n)
        //Space Complexity - O(1)

        TreeSet<Integer> set = new TreeSet<>();
        for (int n : arr) set.add(n);                // O(n log n)

        return (set.size() >= 2) ? set.lower(set.last())  // next‑lower than max
                : null;                  // not enough distinct values
    }
}

