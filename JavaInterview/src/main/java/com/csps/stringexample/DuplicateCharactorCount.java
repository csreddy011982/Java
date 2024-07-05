package com.org.stringexample;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateCharactorCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = " Java Programming Prgram";
		
		Map<Character, Long> result =  inputString.chars().mapToObj(
								c->(char)c) //converting string to character
							.collect(Collectors.groupingBy
										(Function.identity(),Collectors.counting()));
		
		System.out.println(result);
		
	}

}
