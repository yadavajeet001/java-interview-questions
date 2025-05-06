package com.example.java.java8;

import java.util.stream.Stream;

//Concat two string
public class ConcatTwoString {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Hello Ajeet");
        Stream<String> stringStream1 = Stream.of("Hello Ajay");

        Stream<String> concatString = Stream.concat(stringStream, stringStream1);
        System.out.println(concatString.toList());
    }
}
