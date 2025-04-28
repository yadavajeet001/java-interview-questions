package com.example.java.java8;

import java.util.Arrays;
import java.util.List;

/**
 * The reduce() method is used to combine stream elements into a single value using a binary operation.
 * You define an identity value and a function, and the stream applies that function cumulatively to the elements.
 * It’s great for calculations like summing numbers, multiplying them, or creating comma-separated strings.
 */
public class ReduceMethod {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduceResultSum = integerList.stream().reduce(0, Integer::sum);
        System.out.println(reduceResultSum);

        Integer reduceResultMax = integerList.stream().reduce(0, Integer::max);
        System.out.println(reduceResultMax);

        Integer reduceResultMin = integerList.stream().reduce(1, Integer::min);
        System.out.println(reduceResultMin);

    }
}
