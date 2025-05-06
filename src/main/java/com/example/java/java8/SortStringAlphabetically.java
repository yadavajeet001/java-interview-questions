package com.example.java.java8;

import java.util.Arrays;
import java.util.List;

//Sort the string in natural order/Alphabetically
public class SortStringAlphabetically {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Papaya", "Mango");
        List<String> sortedOrder = fruits.stream().sorted().toList();
        System.out.println("Sorted Order :" + sortedOrder);

        //case-insensitive sorting order
        List<String> sortedOrderCaseInsensitive = fruits.stream().sorted(String.CASE_INSENSITIVE_ORDER).toList();
        System.out.println("Sorted Order Case Insensitive :" + sortedOrderCaseInsensitive);
    }
}
