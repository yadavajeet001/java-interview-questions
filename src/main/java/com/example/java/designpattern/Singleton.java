package com.example.java.designpattern;

/**
 * The Singleton Method Design Pattern ensures a class has only one instance
 * and provides a global access point to it.
 * It’s ideal for scenarios requiring centralized control, like managing database connections or configuration settings.
 * This pattern is often used in situations like logging, managing connections to hardware or databases,
 * caching data, or handling thread pools, where having just one instance makes sense
 */
class Singleton {


    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is instantiated");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void doSomeThing() {
        System.out.println("Something is done");
    }

}

class Test {
    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
