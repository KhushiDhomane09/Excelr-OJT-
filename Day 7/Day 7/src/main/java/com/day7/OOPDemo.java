package com.day7;

// ----------------------------
// Parent Class
// ----------------------------
class Animal {

    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method
    public void sound() {
        System.out.println(name + " makes a sound.");
    }
}

// ----------------------------
// Child Class (Inheritance)
// ----------------------------
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void sound() {
        System.out.println(name + " barks.");
    }
}

// ----------------------------
// Encapsulation
// ----------------------------
class Student {

    private String studentName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}

// ----------------------------
// Abstraction
// ----------------------------
abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// ----------------------------
// Interface
// ----------------------------
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}

// ----------------------------
// Main Class
// ----------------------------
public class OOPDemo {

    public static void main(String[] args) {

        // Constructor + Inheritance + Overriding
        Animal animal = new Dog("Dog");
        animal.sound();

        // Encapsulation
        Student s = new Student();
        s.setStudentName("Khushi");
        System.out.println("Student Name = " + s.getStudentName());

        // Abstraction
        Shape shape = new Circle();
        shape.draw();

        // Interface
        Vehicle vehicle = new Car();
        vehicle.start();
    }
}