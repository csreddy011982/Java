package com.csps;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWordFinder {
    public static void main(String[] args) {
        String sentence = "Java is a programming language and Java is also a platform";

        System.out.println("Duplicate words in the string are:");
        findDuplicateWords(sentence);
    }

    public static void findDuplicateWords(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            String wordLowerCase = word.toLowerCase();
            wordCountMap.put(wordLowerCase, wordCountMap.getOrDefault(wordLowerCase, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}


