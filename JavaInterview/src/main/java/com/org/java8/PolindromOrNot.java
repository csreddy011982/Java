package com.org.java8;

import java.util.stream.IntStream;

public class PolindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madama";
		boolean isPolindrom = true;

		str = str.toLowerCase();

		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isPolindrom = false;
				break;
			}
		}
		if (isPolindrom)
			System.out.println(str + "given String is polindrom");

		else
			System.out.println(str + " given String is nor polindrom");
	

	// Using Stream API

	String str1 = "ROTATOR";

	boolean isPolindrom1 = IntStream.range(0, str1.length() / 2)
			.noneMatch(i -> str1.charAt(i) != str1.charAt(str1.length() - i - 1));
	{

		if (isPolindrom1) {
			System.out.println(str1 + "given String is polindrom");

		} else {
			System.out.println(str1 + " given String is nor polindrom");
		}
	}
}
}
