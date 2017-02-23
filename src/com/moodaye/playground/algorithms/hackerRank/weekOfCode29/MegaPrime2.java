package com.moodaye.playground.algorithms.hackerRank.weekOfCode29;


/**
 * The first approach works only for smaller numbers.
 * This approach utilizes the fact that megaprimes
 * are comprised of only the digits 2,3,5,7.
 * The max value of the range is 10^15.
 * 
 * This means that there are (4^14)*2 possible numbers
 * that could be megaprime (each place can be filled with 
 * one of 4 numbers, but the last space cannot be 2 or 5).
 * 
 * 4^14 * 2 = 536,870,912.
 * 
 * Strategy:  Create a loop which iterates through 'first' and
 * 'last' and creates these numbers one at a time. 
 * For each number - it tests for prime - and increments count.
 * 
 * Is there an efficient algorithm to determine prime - for such 
 * large numbers.  Lets try to determine this first
 * @author Rajiv
 *
 */
public class MegaPrime2 {
	
	public static void main(String[] args) {
		System.out.println(testForPrime(600000001));
		System.out.println(testForPrime(600000003));
	}

	//assumes no even number is coming in
	public static boolean testForPrime(int n){
		for(int i=3; i*i<n; i+=2){
			if(n%i == 0)return false;
		}
		
		return true;
	}
}
