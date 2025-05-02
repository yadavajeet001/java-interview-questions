package com.example.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//find the second-largest number from a given list
public class FindTheSecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> secondLast = integerList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondLast.ifPresent(secondValue -> System.out.println("secondLargest value :" + secondValue));
    }
}
