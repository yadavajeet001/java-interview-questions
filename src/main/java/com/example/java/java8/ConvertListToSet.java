package com.example.java.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Convert the List to Set
public class ConvertListToSet {
    public static void main(String[] args) {

        //List to Set
        List<String> namesList = Arrays.asList("Ajeet", "Ajay", "Chandan", "Ajeet");
        Set<String> nameSet = new HashSet<>(namesList);
        nameSet.forEach(System.out::println);
    }
}
