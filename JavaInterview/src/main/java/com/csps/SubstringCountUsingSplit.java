package com.csps;

public class SubstringCountUsingSplit {

    public static void main(String[] args) {
        String input = "Java is great. Java is fun. Java is powerful.";
        String substring = "Java";

        String[] parts = input.split(substring);
        int count = parts.length - 1;

        System.out.println("Number of occurrences using split(): " + count);
    }
}
