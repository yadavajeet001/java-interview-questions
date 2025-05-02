package com.example.java.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreateStreams {

    public static void main(String[] args) throws IOException {

// 1. From a List or Set
        List<String> names = List.of("Ravi", "Sita", "Amit");
        Stream<String> stream1 = names.stream();

// 2. From an Array
        String[] fruits = {"Apple", "Banana", "Mango"};
        Stream<String> stream2 = Arrays.stream(fruits);

// 3. Using Stream.of()
        Stream<Integer> stream3 = Stream.of(10, 20, 30);

// 4. Using Stream.builder()
        Stream<String> stream4 = Stream.<String>builder().add("One").add("Two").add("Three").build();

// 5. Using Stream.generate() (infinite stream)
        Stream<Double> stream5 = Stream.generate(Math::random).limit(5);

// 6. Using Stream.iterate() (infinite stream with pattern)
        Stream<Integer> stream6 = Stream.iterate(1, n -> n + 2).limit(5);

// 7. From Files (using NIO)
        //   Stream<String> lines = Files.lines(Path.of("data.txt"));

        final String prefix = "Hello ";
        Consumer<String> c = name -> System.out.println(prefix + name);
        c.accept("Ravi");
    }
}
