package com.csps.org.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> mylist = Arrays.asList(10,15,89,49,25,78,22,121,143,99);
		
		int maxNumber = mylist.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println(maxNumber);
		
		int minNumber = mylist.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println(minNumber);
		
		// First max 2 number and min 2 number
		
		List<Integer> minNumbers = mylist.stream().sorted(Comparator.naturalOrder()).limit(2).toList();
		
		List<Integer> maxNumbers = mylist.stream().sorted(Comparator.reverseOrder()).limit(2).toList();

		System.out.println(minNumbers);
		
		System.out.println(maxNumbers);
	}

}
