package com.csps;

import java.util.StringTokenizer;

public class WordCountUsingStringTokenizer {

    public static void main(String[] args) {
        String input = "Java is great and Java is fun.";
        StringTokenizer tokenizer = new StringTokenizer(input);
        System.out.println("Number of words using StringTokenizer: " + tokenizer.countTokens());
    }
}
