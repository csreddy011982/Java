package com.csps.org.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArraysFindDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[] = {10,3,7,21,9,8};
		int arr2[] = {4,12,1,3,7,21,9,28};
		
		int result[]=IntStream.concat(Arrays.stream(arr1),Arrays.
				stream(arr2)).sorted().distinct().toArray();
		
		System.out.println(Arrays.toString(result));
		
		for(int i =0;i<result.length;i++) {
			
			System.out.println(" "+result[i]+ " ");
			
		}
	}

}
