package com.day7;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        // 1. Hello World
        System.out.println("Hello World");

        // 2. Variables
        int age = 22;
        double salary = 45000.50;
        char grade = 'A';
        boolean status = true;

        System.out.println("\nVariables");
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
        System.out.println("Grade = " + grade);
        System.out.println("Status = " + status);

        // 3. User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Name: ");
        String name = sc.nextLine();

        System.out.println("Welcome " + name);

        // 4. Type Casting
        double num = 45.78;
        int value = (int) num;

        System.out.println("\nType Casting");
        System.out.println(value);

        // 5. Operators
        int a = 10;
        int b = 5;

        System.out.println("\nOperators");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));

        sc.close();
    }
}