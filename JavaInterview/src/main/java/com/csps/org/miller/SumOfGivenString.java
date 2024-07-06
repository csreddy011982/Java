package com.csps.org.miller;

import java.util.Scanner;
import java.util.regex.Pattern;

//Write a program to sum all the numbers in the given string.
public class SumOfGivenString {

	public static void main(String[] args) {
		Scanner scannerString = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scannerString.nextLine();
		System.out.println(findSumOFGivenString(str));

	}

	public static  int findSumOFGivenString(String str) {
		// TODO Auto-generated method stub

        String temperary = "0";
        int sum =0;
        for(int i=0;i<str.length();i++) {
        	char ch = str.charAt(i);
        	if(Character.isDigit(ch)) {
        		temperary+=ch;
        	}
        	else {
        		sum+=Integer.parseInt(temperary);
        		temperary="0";
        	}
        }
        return sum+Integer.parseInt(temperary);
	}
}
