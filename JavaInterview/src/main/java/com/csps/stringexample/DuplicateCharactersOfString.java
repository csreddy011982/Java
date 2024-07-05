package com.org.stringexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateCharactersOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am working as a java developer";
		
		String arr[] = str.replaceAll("\s","").toLowerCase().split("");
		
		Set<String> dupcharset=new HashSet<>();
		
		Set<String> resultSet = Arrays.stream(arr).filter(ch->
		!dupcharset.add(ch)).collect(Collectors.toSet());
		
		System.out.println(resultSet);
	}

}
