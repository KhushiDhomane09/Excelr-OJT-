package com.day7;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Print 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // 2. Sum of First N Numbers
        System.out.print("\n\nEnter N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        // 3. Factorial
        System.out.print("\nEnter Number for Factorial: ");
        int factNum = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= factNum; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);

        // 4. Multiplication Table
        System.out.print("\nEnter Number for Table: ");
        int table = sc.nextInt();

        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

        // 5. Fibonacci Series
        System.out.print("\nEnter Number of Terms: ");
        int terms = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= terms; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        // 6. Prime Number
        System.out.print("\n\nEnter Number to Check Prime: ");
        int num = sc.nextInt();

        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }

            }

        }

        if (prime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");

        sc.close();
    }
}