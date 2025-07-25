package com.example.java.collection;

// Java demo: Using objects as keys in HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // ✅ Correct: Override equals() and hashCode()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee other)) return false;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Dummy {
}

public class HashMapKeyDemo {

    public static void main(String[] args) {
        // ✅ Using Employee as key and Dummy object as value
        Map<Employee, Dummy> map1 = new HashMap<>();
        Employee emp1 = new Employee(101, "Ajeet");
        Employee emp2 = new Employee(101, "Ajeet"); // logically same

        map1.put(emp1, new Dummy());
        System.out.println("map1.containsKey(emp2): " + map1.containsKey(emp2)); // true

        // ✅ Using Employee as key and String as value
        Map<Employee, String> map2 = new HashMap<>();
        map2.put(emp1, "Senior Java Developer");

        System.out.println("map2.get(emp2): " + map2.get(emp2)); // Outputs: Senior Java Developer

        // ❌ Without overriding equals() and hashCode()
        BadEmployee b1 = new BadEmployee(102, "Rahul");
        BadEmployee b2 = new BadEmployee(102, "Rahul");

        Map<BadEmployee, String> map3 = new HashMap<>();
        map3.put(b1, "Java Dev");

        System.out.println("map3.get(b2): " + map3.get(b2)); // null (incorrect behavior)
    }
}

class BadEmployee {
    int id;
    String name;

    public BadEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

