package com.moodaye.playground.algorithms.hackerRank;

import java.util.Scanner;

/**
 * 
* We define the following:
* 
* A subarray of an n-element array, A, is a contiguous subset of A's elements in the inclusive 
* range from some index i to some index j where 0<=i<=j<=n.
* The sum of an array is the sum of its elements.
* Given an n-element array of integers, A, and an integer, m, determine the maximum value of the 
* sum of any of its subarrays modulo m. This means that you must find the sum of each subarray 
* modulo m, then print the maximum result of this modulo operation for any of the  possible 
* subarrays.
* 
* Input Format
* 
* The first line contains an integer, q, denoting the number of queries to perform. Each query 
* is described over two lines:
* 
* 1. The first line contains two space-separated integers describing the respective n(the array 
* length) and m(the right operand for the modulo operations) values for the query.
* 2. The second line contains n space-separated integers describing the respective elements of 
* array A = a0,a1,...,an-1 for that query.
* Constraints
* 2<=n<=10^5
* 1<=m<=10^14
* 1<=ai<=10^18
* 2<= the sum of n over all test cases 
* Output Format
* 
* For each query, print the maximum value of subarray sum %m on a new line.
*/

public class MaximumSubarraySum {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int numberOfQueries = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] parr = new int[n];
		
		int maxMod = -1;
		
		for (int i=0; i<n; i++){
			parr[i] = in.nextInt();
		}
		
		//compute modulo
		for (int i=0; i<n; i++){
			int mod = parr[i]%m;
			if (maxMod < mod) maxMod = mod;
		}
		
		in.close();
	}
	
}
