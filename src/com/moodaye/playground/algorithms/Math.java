package com.moodaye.playground.algorithms;

public class Math {
	
	/**
	 * returns gcd of the 2 integers
	 * Implementation of Euclid's Theorem
	 */
	public static int gcd(int a, int b){
		int mod = -1;
		
		if (a < 0) a = -1 * a;
		if (b < 0) b = -1 * b;
		
		
		while (mod != 0){
			mod = a%b;
			a = b;
			b = mod;
		}
		return a;
	}

}
