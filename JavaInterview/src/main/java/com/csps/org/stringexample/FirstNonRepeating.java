package com.csps.org.stringexample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here String converting into lowercase with space replace.		
		String str2 = "zxvczbtxyzvy".replaceAll("\\s+", "").toLowerCase();

		Map<String, Long> map = Arrays.stream(str2.split(""))
				.collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new, Collectors.counting()));

		String firstRepeatedChar = map.entrySet().stream().filter(entry -> 
									entry.getValue() == 1).map(entry -> 
									entry.getKey()).findFirst().get();
		
		System.out.println(firstRepeatedChar);

	}

}
