package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorial(n));
	}
	
	private static BigInteger factorial(int n){
		if (n == 2)
			return new BigInteger(String.valueOf(2));
		else 
			return (new BigInteger(String.valueOf(n)).multiply(
					factorial(n-1)));
	}
}
