package com.csps.org.java8;

public class FionaccSeriesRecursive {

	static int num1=0;
	static int num2 =1;
	static int limit=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fibonacci series using recu" +num1+" "+num2+"");
		
		printFibonacciNum(limit-2);
	}

	private static void printFibonacciNum(int limit) {
		// TODO Auto-generated method stub
		
		if(limit >0) {
			int sum = num1+num2;
			System.out.println(""+sum);
			num1=num2;
			num2=sum;
			printFibonacciNum(limit-1);
		}
	}

}
