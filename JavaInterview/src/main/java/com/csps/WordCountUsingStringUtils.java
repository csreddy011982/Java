package com.csps;

import org.apache.commons.lang3.StringUtils;

public class WordCountUsingStringUtils {

    public static void main(String[] args) {
        String input = "Java is great and Java is fun.";
        int count = StringUtils.split(input, ' ').length;
        System.out.println("Number of words using StringUtils: " + count);
    }
}
