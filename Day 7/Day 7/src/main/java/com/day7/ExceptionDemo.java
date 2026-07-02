package com.day7;

public class ExceptionDemo {

    // Method using throws
    public static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("Eligible for Voting");
    }

    public static void main(String[] args) {

        // 1. Try-Catch
        try {

            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception: " + e.getMessage());

        }

        // 2. Multiple Catch
        try {

            String name = null;

            System.out.println(name.length());

        } catch (NullPointerException e) {

            System.out.println("Null Pointer Exception");

        } catch (Exception e) {

            System.out.println("General Exception");

        }

        // 3. Finally Block
        finally {

            System.out.println("Finally block executed.");

        }

        // 4. Throw & Throws
        try {

            checkAge(16);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}