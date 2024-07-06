package com.csps.org.stringexample;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerString = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scannerString.nextLine();
		System.out.println(reverseWords(str));
	}

	 public static  String reverseWords(String str) {
		// TODO Auto-generated method stub

        Pattern pattern = Pattern.compile("\\s"); 

        String[] temperary = pattern.split(str); 
        String reverseWords = ""; 
        for (int i = 0; i < temperary.length; i++) { 
            if (i == temperary.length - 1) 
            	reverseWords = temperary[i] + reverseWords; 
            else
            	reverseWords = " " + temperary[i] + reverseWords; 
        } 
        return reverseWords; 
	}
}
