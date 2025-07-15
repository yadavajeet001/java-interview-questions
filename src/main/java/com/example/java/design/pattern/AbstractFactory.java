package com.example.java.design.pattern;

/**
 * The Abstract Factory Pattern is one of the creational design patterns
 * that provides an interface for creating families of related or dependent objects
 * without specifying their concrete classes and implementation,
 * in simpler terms the Abstract Factory Pattern is a way of organizing how you create groups of things
 * that are related to each other.
 * <p>
 * Abstract Factory pattern is almost same as Factory Pattern
 * and is considered as another layer of abstraction over factory pattern.
 * <p>
 * Abstract Factory patterns work around a super-factory which creates other factories
 * At runtime, the abstract factory is coupled with any desired concrete factory which can create
 * objects of the desired type.
 * Use - When your system requires multiple families of related products and you want to ensure compatibility between them.
 */

//Abstract factory interface
interface CarFactory {
    Car createCar();

    CarSpecification createSpecification();
}

//Abstract product interface for cars
interface Car {
    void assemble();
}

//Abstract product interface for specification
interface CarSpecification {
    void specification();
}

//Concrete factory for north america cars
class NorthAmericaCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}

//Concrete factory for europe cars
class EuropeCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new HatchBack();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}

// Concrete Product for Sedan Car
class Sedan implements Car {

    @Override
    public void assemble() {
        System.out.println("Assemble Sedan Car");
    }
}

// Concrete Product for HatchBack Car
class HatchBack implements Car {
    @Override
    public void assemble() {
        System.out.println("Assemble HatchBack Car");
    }
}

// Concrete Product for North America Car Specification
class NorthAmericaSpecification implements CarSpecification {

    @Override
    public void specification() {
        System.out.println("NorthAmerica Specification");
    }
}

// Concrete Product for North America Car Specification
class EuropeSpecification implements CarSpecification {

    @Override
    public void specification() {
        System.out.println("Europe Specification");
    }
}

//Driver Class
public class AbstractFactory {
    public static void main(String[] args) {

        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpecification = northAmericaFactory.createSpecification();
        northAmericaCar.assemble();
        northAmericaSpecification.specification();

        CarFactory europeCarFactory = new EuropeCarFactory();
        Car europeCar = europeCarFactory.createCar();
        CarSpecification europeSpecification = europeCarFactory.createSpecification();
        europeCar.assemble();
        europeSpecification.specification();
    }
}
