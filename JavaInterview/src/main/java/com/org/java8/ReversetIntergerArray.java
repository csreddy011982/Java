package com.org.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversetIntergerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[] {1,11,7,3,9,6,21};
		
		for(int i=array.length-1;i>=0;i--) {
			
			System.out.println(""+array[i]+" ");
		}
		
		//Using API stream
		
		int[] reversyArray = IntStream.rangeClosed(1, array.length).map(
				i -> array[array.length-i]).toArray();

		System.out.println(Arrays.toString(reversyArray));
	}

}
