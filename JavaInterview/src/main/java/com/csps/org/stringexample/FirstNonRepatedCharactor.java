package com.csps.org.stringexample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepatedCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "gbblegabbler";

		for (int i = 0; i < str1.length(); i++) {

			boolean flag = true;

			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("the First non repeated charater in string is;" + str1.charAt(i));
				break;
			}
		}
		
		// using java 8 Stream API
		
		String str2= "Programming Java".replaceAll("\\s+", "").toLowerCase();
		
		Map<String, Long> map = Arrays.stream(str2.split("")).collect(
				Collectors.groupingBy(Function.identity(),LinkedHashMap:: new, 
						Collectors.counting()));
		
		String firstRepeatedChar = map.entrySet().stream().filter(entry -> entry.getValue()==1)
				.map(entry -> entry.getKey()).findFirst().get();
		
		System.out.println(firstRepeatedChar);
	}

}
