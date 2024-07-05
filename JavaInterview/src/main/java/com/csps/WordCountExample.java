package com.csps;

import org.apache.commons.lang3.StringUtils;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCountExample {

    public  static void main(String[] args) {
        String input = "Java is great and Java is fun.";

        // Using split() method
        String[] wordsUsingSplit = input.split("\\s+");
        System.out.println("Number of words using split(): " + wordsUsingSplit.length);

        // Using StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer(input);
        System.out.println("Number of words using StringTokenizer: " + tokenizer.countTokens());

        // Using Regular Expressions
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(input);
        int countUsingRegex = 0;
        while (matcher.find()) {
            countUsingRegex++;
        }
        System.out.println("Number of words using regex: " + countUsingRegex);

        // Using Apache Commons Lang StringUtils
        int countUsingStringUtils = StringUtils.split(input, ' ').length;
        System.out.println("Number of words using StringUtils: " + countUsingStringUtils);
    }
}
