package com.day7;

public class StringPrograms {

    public static void main(String[] args) {

        String str = "Java Programming";

        // 1. String Length
        System.out.println("Length = " + str.length());

        // 2. Convert to Uppercase
        System.out.println("Uppercase = " + str.toUpperCase());

        // 3. Convert to Lowercase
        System.out.println("Lowercase = " + str.toLowerCase());

        // 4. Reverse String
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reverse = " + reverse);

        // 5. Palindrome Check
        String word = "madam";

        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }

        if (word.equals(rev))
            System.out.println(word + " is Palindrome");
        else
            System.out.println(word + " is Not Palindrome");

        // 6. Count Vowels
        String text = "Education";

        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                vowels++;
            }

        }

        System.out.println("Vowels = " + vowels);

        // 7. Compare Strings
        String s1 = "Java";
        String s2 = "Java";

        if (s1.equals(s2))
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");

        // 8. Remove Spaces
        String sentence = "Java Full Stack";

        System.out.println("Without Spaces = "
                + sentence.replace(" ", ""));

        // 9. Count Words
        String line = "Java is easy to learn";

        String[] words = line.split(" ");

        System.out.println("Word Count = " + words.length);

        // 10. Contains Method
        if (str.contains("Java"))
            System.out.println("Java Found");
        else
            System.out.println("Java Not Found");

    }
}