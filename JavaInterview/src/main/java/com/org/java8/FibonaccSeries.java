package com.org.java8;

import java.util.stream.Stream;

public class FibonaccSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 1;
		int limit = 10;

		for (int i = 0; i < limit; i++) {

			System.out.println(num1 + "");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
		}
		System.out.println();
		
		Stream.iterate(new int[] {0,1}, f ->new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).
		forEach(i-> System.out.print(i+" "));
	}

}
