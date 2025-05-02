package com.example.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

//write a java 8 program to find the maximum and minimum number in the given list
public class FindTheMaxAndMinNumber {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        OptionalInt maxValue = integerList.stream().mapToInt(Integer::intValue).max();
        maxValue.ifPresent(max -> System.out.println("maximum : " + max));

        OptionalInt minValue = integerList.stream().mapToInt(Integer::intValue).min();
        minValue.ifPresent(min -> System.out.println("minimum : " + min));

    }
}
