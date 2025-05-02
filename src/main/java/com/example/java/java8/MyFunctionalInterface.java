package com.example.java.java8;

@FunctionalInterface
public interface MyFunctionalInterface {

    // Static method - can have any number
    static void staticMethod() {
        System.out.println("Static method");
    }

    //Single abstract method - should have only one
    void execute();

    // Default method - can have any number
    default void defaultMethod() {
        System.out.println("Default method");
    }
}

class TestFunctionalInterface {
    public static void main(String[] args) {
        MyFunctionalInterface functionalInterfaceExample = () -> System.out.println("Executing functional interface method execute()...");
        functionalInterfaceExample.execute();
    }
}


