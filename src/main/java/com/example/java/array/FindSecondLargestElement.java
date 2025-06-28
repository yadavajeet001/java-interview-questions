package com.example.java.array;

public class FindSecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {12, 36, 3, 5, 35};

        int largest = 0, secondLargest = 0;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
    }
}
