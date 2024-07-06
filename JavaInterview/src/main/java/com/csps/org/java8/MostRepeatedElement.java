package com.csps.org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MostRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("java","oracle","hi","java","spring");
	
	Map<String,Long> map = list.stream().collect(Collectors.groupingBy(
			str->str, Collectors.counting()));
	
	Entry<String,Long> result = map.entrySet().stream().
			max(Map.Entry.comparingByValue()).get();
	
	System.out.println("Most repeated Elemnt "+result.getKey()+ "-- number of times is "+result.getValue());
	}
	

}
