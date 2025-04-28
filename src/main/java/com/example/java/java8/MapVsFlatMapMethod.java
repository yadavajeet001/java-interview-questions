package com.example.java.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Use map() when you want to transform individual elements in a stream.
 * Use flatMap() when each element itself is a collection or stream, and you want to flatten it into one combined stream.
 */
public class MapVsFlatMapMethod {
    public static void main(String[] args) {

        //map()
        List<String> mapList = Arrays.asList("Hello java", "java map() example");
        List<List<String>> mapResult = mapList.stream().map(list -> Arrays.asList(list.split(" "))).toList();
        System.out.println(mapList);

        //convert string to integer
        List<String> flapMapResult = mapList.stream().flatMap(list -> Arrays.stream(list.split(" "))).toList();
        System.out.println("String to Integer: " + flapMapResult);

        //flatMap()
        List<String> strings = Arrays.asList("1", "2", "3");
        List<Integer> resultStringToInteger = strings.stream().map(Integer::valueOf).toList();
        System.out.println(resultStringToInteger);

        List<Integer> odd = Arrays.asList(1, 3, 5);
        List<Integer> even = Arrays.asList(2, 4, 6);

        List<Integer> flatMap = Stream.of(odd, even).flatMap(Collection::stream).toList();
        System.out.println(flatMap);
    }
}
