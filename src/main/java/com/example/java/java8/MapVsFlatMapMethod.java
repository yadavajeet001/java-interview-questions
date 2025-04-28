package com.example.java.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Use map() when you want to transform individual elements in a stream.
 * Use flatMap() when each element itself is a collection or stream, and you want to flatten it into one combined stream.
 */
public class MapVsFlatMapMethod {
    public static void main(String[] args) {

        //map()
        List<String> mapList = Arrays.asList("Hello java", "java map() example");
        List<List<String>> mapResult = mapList.stream().map(list -> Arrays.asList(list.split(" ")))
                .toList();
        System.out.println(mapList);

        //flatMap()
        List<String> flapMapResult = mapList.stream().flatMap(list -> Arrays.stream(list.split(" "))).toList();
        System.out.println(flapMapResult);
    }
}
