package com.moodaye.playground.algorithms.hackerRank.weekOfCode29;

import java.util.List;

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
 * Actually since the range between first and last is 
 * 10^9 - the actual max number of numbers we need to test
 * would be 4^8 * 2 = 131072
 * 
 * Strategy:  Create a loop which iterates through 'first' and
 * 'last' and creates these numbers one at a time. 
 * For each number - it tests for prime - and increments count.
 * 
 * Starting from 10^15 and descending - it takes 7 seconds to 
 * test 1400 numbers.  To test 100 times that (~131072) - it would 
 * take 700 seconds.
 * 
 * Is there an efficient algorithm to determine prime - for such 
 * large numbers.  Lets try to determine this first
 * @author Rajiv
 *
 */
public class MegaPrime2 {
	
	public static void main(String[] args) {
		testTime();
	}

	//Want to see how long it would take to check the largest
	// 4^14 * 2 numbers for prime. Just to check the viability of 
	//the approach
	private static void testTime(){
		
		long start = 1000000000000000L;
		long stime = System.currentTimeMillis()/1000;
		int count = 0;
//		for (int i=0; i<6870912; i++){
		for (int i=0; i<1400; i++){
			if(testForPrime(start))
				count++;
			start--;
		}
		long ftime = System.currentTimeMillis()/1000;
		System.out.println(ftime - stime);
		System.out.println(count);
	}

	//assumes no even number is coming in
	public static boolean testForPrime(long n){
		if (n % 2L == 0){
			return false;
		}
		for(long i=3; i*i<n; i+=2){
			if(n%i == 0)return false;
		}
		
		return true;
	}

	/**
	 * return a list of Long numbers that we need to test.  Only
	 * includes numbers with digits comprising 2,3,5,7 and not
	 * ending in 2 or 5.
	 * ]
	 * @param start
	 * @param finish
	 * @return
	 */
	private List<Long> megaCandidates(long start,long finish){
		
		//start with a number that is the length of finish.
		//and less than or equal to finish.
		String strFinish = String.valueOf(finish);
		int length = strFinish.length();
		int firstDigit = Integer.valueOf(strFinish.charAt(0));
	
		//we are only dong this for first digit - but an optimization
		//would have us doing it for all the digits. E.g., 
		//if finish = 700 - we would start here with 777 instead
		//of the optimal start which would be 577
		if(firstDigit >= 7) firstDigit = 7;
		if(firstDigit >= 5) firstDigit = 5;
		if(firstDigit >= 3) firstDigit = 7;
		else firstDigit = 2;
	
		return null;
	}
	
	//Thoughts on creating a loop
	//Given the number of digits (n) of the top of the range number
	//we need to generate numbers using only the specified digits 
	//(e.g., 7,5,3,2). We are given the left most digit we need to 
	//start with. Also - we cannot use 2 or 5 as the rightmost digit
	//We generate numbers to the finish number.
	//
	//put specified digits into an array of char
	private void generateNumbers(long start, long finish){
		char[] sd = {'7','5','3','2'};
		int len = 3; //say
		int td = 5;
		
		for(;len>0; len--){
			for(int i=0; i<sd.length; i++){
				StringBuffer buff = new StringBuffer();
				buff.append(sd[i]);
			}
		}
	}
}
