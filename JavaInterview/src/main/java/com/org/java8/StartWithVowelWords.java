package com.org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithVowelWords {

	public static void main(String[] args) {

		//Create a list of words
		List<String> list = Arrays.asList("apple","boy","Eagle");
		
		//find the words starting with vowels using stream API

		List<String> startingWithVowel = list.stream().map(words -> words.toLowerCase())
				.filter(word -> word.charAt(0)=='a' || word.charAt(0)=='e'|| 
						word.charAt(0)=='o' || word.charAt(0)=='i'|| 
						 word.charAt(0)=='u').collect(Collectors.toList());
		
		System.out.println(startingWithVowel);
		
	}
}
