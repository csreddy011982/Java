package com.org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindoutGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> mylist = Arrays.asList(10,15,48,49,25,28,22);
		
		List<String> result = mylist.stream().map(s -> s+"").
				filter(s ->s.startsWith("4")).collect(Collectors.toList());
		
		System.out.println(result);
		
		
		List<String> mylistString = Arrays.asList("Chandra","reddy","sunitha");
		
		List<String>strResult= mylistString.stream().filter(s -> s.startsWith("r")).collect(Collectors.toList());
				
		strResult.forEach(System.out::println);	
	}

}
