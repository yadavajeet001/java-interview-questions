package com.example.java.array;

import java.util.Stack;

//EPAM Systems
public class FindNextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 8, 6};
        findNextGreaterElements(arr);
    }

    private static void findNextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            // Compare current num with elements in the stack
            while (!stack.isEmpty() && num > stack.peek()) {
                int smallerValue = stack.pop();
                System.out.println(smallerValue + "-> " + num);
            }
            stack.push(num);
        }
        // All elements left in the stack have no greater element
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + "-> -1");
        }
    }
}
