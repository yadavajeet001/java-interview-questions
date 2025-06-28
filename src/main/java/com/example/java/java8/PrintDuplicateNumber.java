package com.example.java.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintDuplicateNumber {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4);
        int[] arr = {1, 3, 4, 4, 5, 5};
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = list.stream().filter(value -> !set.add(value))
                .collect(Collectors.toSet());
        System.out.println(res);

        //or
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> res2 = IntStream.of(arr).boxed().filter(value -> !hashSet.add(value))
                .collect(Collectors.toSet());
        System.out.println(res2);

        //or

        Map<Integer, Long> map = IntStream.of(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(value -> value.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        map.forEach((key, value) -> System.out.println(key + "->" + value));


    }
}
