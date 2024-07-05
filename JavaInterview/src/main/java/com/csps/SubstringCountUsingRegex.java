package com.csps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringCountUsingRegex {

    public static void main(String[] args) {
        String input = "Java is great. Java is fun. Java is powerful.";
        String substring = "Java";

        Pattern pattern = Pattern.compile(substring);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("Number of occurrences using regex: " + count);
    }

}
