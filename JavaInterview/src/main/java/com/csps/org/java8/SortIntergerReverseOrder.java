package com.csps.org.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntergerReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[]= {11,22,33,44,22,77,88,88,33};
		
		//With out collection using JAVA 
		
		int temp =0;
		
		for (int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Element of array sorted order :");
		
		for (int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]+"");
		}
		
		//using Steam API
		
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> resultSet=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
		System.out.println(resultSet);
	}

}
