package com.csps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringCountExample {

    public static void main(String[] args) {
        String input = "Java is great. Java is fun. Java is powerful.";
        String substring = "Java";

        // Using split() method
        String[] parts = input.split(substring);
        int countUsingSplit = parts.length - 1;
        System.out.println("Number of occurrences using split(): " + countUsingSplit);

        // Using indexOf() method
        int countUsingIndexOf = 0;
        int index = 0;
        while ((index = input.indexOf(substring, index)) != -1) {
            countUsingIndexOf++;
            index += substring.length();
        }
        System.out.println("Number of occurrences using indexOf(): " + countUsingIndexOf);

        // Using Regular Expressions
        Pattern pattern = Pattern.compile(substring);
        Matcher matcher = pattern.matcher(input);
        int countUsingRegex = 0;
        while (matcher.find()) {
            countUsingRegex++;
        }
        System.out.println("Number of occurrences using regex: " + countUsingRegex);
    }
}
