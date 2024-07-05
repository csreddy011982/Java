package com.org.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234567;
		int sum =0;
		String str = Integer.toString(num);
		String strarr[] = str.split("");
		
		System.out.println("length + " +strarr.length);
		
		for(int i=0; i<strarr.length;i++) {
			sum+=Integer.parseInt(strarr[i]);
			
		}
		System.out.println(sum);
		
		//using Stream API
		Integer sumOfDigit = Stream.of(String.valueOf(num)
				.split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println(sumOfDigit);
	}

}
