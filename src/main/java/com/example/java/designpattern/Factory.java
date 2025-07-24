package com.example.java.designpattern;

/**
 * The Factory Method Design Pattern is a creational design pattern
 * that provides an interface for creating objects in a superclass,
 * allowing subclasses to alter the type of objects that will be created.
 * This pattern is particularly useful when the exact types of objects to be created
 * may vary or need to be determined at runtime, enabling flexibility and extensibility in object creation.
 * Use - If your object creation process is complex or varies under different conditions,
 * using a factory method can make your client code simpler and promote reusability.
 */

interface VehicleFactory {
    Vehicle createVehicle();
}

abstract class Vehicle {
    void printVehicle() {
    }
}

class TwoWheeler extends Vehicle {
    void printVehicle() {
        System.out.println("Two wheeler");
    }
}

class FourWheeler extends Vehicle {
    void printVehicle() {
        System.out.println("Four wheeler");
    }
}

class TwoWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

//Client class
class Factory {
    private final Vehicle vehicle;

    Factory(VehicleFactory vehicleFactory) {
        this.vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

//Driver class
class TestFactory {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory2 = new TwoWheelerFactory();
        Factory factory2 = new Factory(vehicleFactory2);
        Vehicle vehicle2 = factory2.getVehicle();
        vehicle2.printVehicle();

        VehicleFactory vehicleFactory4 = new FourWheelerFactory();
        Factory factory4 = new Factory(vehicleFactory4);
        Vehicle vehicle4 = factory4.getVehicle();
        vehicle4.printVehicle();
    }
}

