package com.csps.org.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[] = {54,21,65,51,42,57,31,98};
		int length = arr.length;
		
		int temp =0;
		for(int i=0;i<=length;i++) {
			
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Secnond larget number" +arr[length-2]);
		
	//using stram API
		
		List<Integer> listOfinteger = Arrays.asList(arr);
		
		Integer value= listOfinteger.stream().sorted(Comparator.
				reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(value);
	}
}
