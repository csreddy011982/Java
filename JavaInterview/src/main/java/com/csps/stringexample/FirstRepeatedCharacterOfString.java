package com.org.stringexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "java tutorial";
		
		boolean isFound = false;
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println("---" +str.charAt(i)+" ** is the first reapted charater");
					isFound = true;
					break;
				}
			}
			
			if(isFound) {
				break;
			}
		}
		
		// Using collection framework
		
		Set<Character> chars= new HashSet<Character>();
		for(int i=0; i<str.length();i++) {
			
			if(!chars.add(str.charAt(i))) {
				System.out.println(str.charAt(i)+" is the first charactor that occurs");
				break;
			}
			
		}
		
		//using JAva 8 Stream API
		
		// using java 8 Stream API
		
				String str2= "Programming Java".replaceAll("\\s+", "").toLowerCase();
				
				Map<String, Long> map = Arrays.stream(str2.split("")).collect(
						Collectors.groupingBy(Function.identity(),LinkedHashMap:: new, 
								Collectors.counting()));
				
				String firstRepeatedChar = map.entrySet().stream().filter(entry -> entry.getValue()>1)
						.map(entry -> entry.getKey()).findFirst().get();
				
				System.out.println(firstRepeatedChar);

	}

}
