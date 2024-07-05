package com.org.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("java","oracle","hi","spring");
		
		list.stream().sorted(Comparator.comparing(String :: length )).forEach(System.out::println);
	}

}
