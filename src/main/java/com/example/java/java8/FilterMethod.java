package com.example.java.java8;

import java.util.Arrays;
import java.util.List;

/**
 * The filter() method is used to keep only those elements that satisfy a given condition.
 * It’s a powerful way to apply logic directly to a stream without needing an if-condition or manual removal.
 */
public class FilterMethod {
    public static void main(String[] args) {

        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> filterResult = arrayList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(filterResult);
    }
}
