package com.day7;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Even or Odd
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

        // 2. Positive, Negative or Zero
        System.out.print("\nEnter another number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        // 3. Largest of Three Numbers
        System.out.print("\nEnter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest = " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest = " + b);
        else
            System.out.println("Largest = " + c);

        // 4. Leap Year
        System.out.print("\nEnter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is Not a Leap Year");

        // 5. Grade Calculator
        System.out.print("\nEnter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 60)
            System.out.println("Grade C");
        else if (marks >= 35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");

        sc.close();
    }
}