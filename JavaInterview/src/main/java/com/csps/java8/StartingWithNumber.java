package com.org.java8;

import java.util.Arrays;
import java.util.List;

public class StartingWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"one","2wo","6ix","8ight","chandra","9nine"};
		
		List<String> list = Arrays.asList(arr);
		
		list.stream().filter(str-> Character.isDigit(str.charAt(0))).forEach(System.out::print);
	}

}
