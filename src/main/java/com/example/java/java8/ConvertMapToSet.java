package com.example.java.java8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Convert the given Map to Set
public class ConvertMapToSet {
    public static void main(String[] args) {

        //Map to Set
        Map<String, String> map = new HashMap<>();
        map.put("Ajeet", "Noida");
        map.put("Chandan", "Delhi");
        map.put("Ajay", "Deoria");
        map.put("Ajay", "Deoria");
        Set<String> stringSet = new HashSet<>(map.keySet());
        stringSet.forEach(System.out::println);
    }
}
