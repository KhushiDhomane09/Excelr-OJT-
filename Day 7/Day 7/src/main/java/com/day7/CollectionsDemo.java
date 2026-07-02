package com.day7;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        // ============================
        // 1. ArrayList
        // ============================

        ArrayList<String> students = new ArrayList<>();

        students.add("Khushi");
        students.add("Rahul");
        students.add("Sneha");

        System.out.println("ArrayList:");
        System.out.println(students);

        // ============================
        // 2. LinkedList
        // ============================

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nLinkedList:");
        System.out.println(numbers);

        // ============================
        // 3. HashSet
        // ============================

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Apple");   // Duplicate

        System.out.println("\nHashSet:");
        System.out.println(fruits);

        // ============================
        // 4. TreeSet
        // ============================

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(80);
        marks.add(60);
        marks.add(90);
        marks.add(70);

        System.out.println("\nTreeSet:");
        System.out.println(marks);

        // ============================
        // 5. HashMap
        // ============================

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Khushi");
        map.put(102, "Rahul");
        map.put(103, "Sneha");

        System.out.println("\nHashMap:");
        System.out.println(map);

        // ============================
        // 6. Iterator
        // ============================

        System.out.println("\nIterator:");

        Iterator<String> itr = students.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ============================
        // 7. forEach Loop
        // ============================

        System.out.println("\nForEach:");

        for (String student : students) {
            System.out.println(student);
        }

    }
}