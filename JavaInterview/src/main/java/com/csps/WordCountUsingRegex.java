package com.csps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCountUsingRegex {

    public  static void main(String[] args) {
        String input = "Java is great and Java is fun.";
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Number of words using regex: " + count);
    }
}
