package com.day7;

public class MethodsDemo {

    // 1. Method without Parameters
    public void display() {
        System.out.println("Welcome to Java Methods");
    }

    // 2. Method with Parameters
    public void addition(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    // 3. Method with Return Type
    public int square(int num) {
        return num * num;
    }

    // 4. Method Overloading
    public void print(int num) {
        System.out.println("Integer Value = " + num);
    }

    public void print(String text) {
        System.out.println("String Value = " + text);
    }

    public static void main(String[] args) {

        MethodsDemo obj = new MethodsDemo();

        // Method without Parameters
        obj.display();

        // Method with Parameters
        obj.addition(10, 20);

        // Method with Return Type
        int result = obj.square(5);
        System.out.println("Square = " + result);

        // Method Overloading
        obj.print(100);
        obj.print("Java Programming");
    }
}