package com.csps.org.stringexample;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GivenStringAnagramorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = "cheater";
		String st2 = "teacher";
		//check if length is same
		if(st1.length()==st2.length()) {
			
			//convert strings as char array
			char[] chararray1 = st1.toCharArray();
			char[] chararray2 = st2.toCharArray();
			
			// sort the char array
			Arrays.sort(chararray1);
			Arrays.sort(chararray2);
			
			//if sorted char array same then the sting is anagram
			
			boolean result = Arrays.equals(chararray1, chararray2);
			
			
			if(result) {
				System.out.println(st1 + " and " + st2 +" are anagram");
			}
			else {
				System.out.println(st1 + " and " + st2 +" are not anagram");
			}
			
			
		}
		
		//using Stream API
		
		st1 = Stream.of(st1.split("")).map(s -> s.toLowerCase()).sorted().collect(Collectors.joining());
		st2 = Stream.of(st2.split("")).map(s -> s.toLowerCase()).sorted().collect(Collectors.joining());
	
		if(st1.equals(st2)) {
			System.out.println(st1 + " and " + st2 +" are anagram");
		}
		else {
			System.out.println(st1 + " and " + st2 +" are not anagram");
		}
	
	}

}
