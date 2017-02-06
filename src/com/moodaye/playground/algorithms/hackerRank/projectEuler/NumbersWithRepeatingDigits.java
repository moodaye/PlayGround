package com.moodaye.playground.algorithms.hackerRank.projectEuler;

import java.util.Scanner;

/**
 * Problem appearing on hackerrank.com .... project Euler section
 * How many k-digit numbers n(without leading zeroes) are there such that no 
 * digit occurs more than m times in n? Output the answer modulo 10^9 + 7.
 *   
 *   Input Format
 *   The first line of input contains two integers m and t. Here, t is the 
 *   number of queries. The following t lines contain an integer k each.
 *   Constraints
 *   	1 <= m <= 10^5
 *   	1 <= t <= 10^5
 *   	1 <= k <= min(10xm, 10^5)
 *   	
 *   Output Format
 *   For each query, print the integer which is the answer to the problem modulo 
 *   10^9 + 7.
 *   
 *   Sample Input 0
 *   3 2
 *   3
 *   4
 *   Sample Output 0
 *   900
 *   8991
 *   
 *   Explanation 0
 *   For the first query, each 3-digit number is valid. For the second query, each 
 *   4-digit number except for 1111,2222 3333,...9999 is valid.
 * @author Rajiv
 *
 */
public class NumbersWithRepeatingDigits {
	

	/**
	 * 
	 * @param m    number of allowed repeats
	 * @param k    number of digits
	 * @return     count of numbers of k digits that don't have more than
	 *             m repeating digits
	 */
	public static int computeNoRepeats(int m, int k){
		
		int[] digitCounts = null;
		int count = 0;
	
		// if k = 2; then i goes from 10^1 to 10^2 (or 10 to 99)
		int totalNumbers = (int) Math.pow(10, k) - (int) Math.pow(10, k-1);
		System.out.println("going from " + Math.pow(10, k-1) + " to " + Math.pow(10, k));
		for (int i= (int) Math.pow(10,k-1); i<Math.pow(10,k); i++){
			char[] i_char = String.valueOf(i).toCharArray();
			digitCounts = new int[10];
			for (int j=0; j<k; j++){
				switch(i_char[j]){
					case '0': digitCounts[0]++; break;
					case '1': digitCounts[1]++; break;
					case '2': digitCounts[2]++; break;
					case '3': digitCounts[3]++; break;
					case '4': digitCounts[4]++; break;
					case '5': digitCounts[5]++; break;
					case '6': digitCounts[6]++; break;
					case '7': digitCounts[7]++; break;
					case '8': digitCounts[8]++; break;
					case '9': digitCounts[9]++; break;
				}
			}
		
			for (int a: digitCounts){
				if (a > m){
					count += a % m;
				}
			}
		}
		return totalNumbers - count;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int tests = in.nextInt();
		int k = 0;
		for (int i = 0; i < tests; i++) {
			k = in.nextInt();
			System.out.println(computeNoRepeats(m, k));
		}
	}
}
