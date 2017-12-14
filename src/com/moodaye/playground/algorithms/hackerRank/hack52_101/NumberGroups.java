package com.moodaye.playground.algorithms.hackerRank.hack52_101;

import java.util.Scanner;

public class NumberGroups {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        in.close();
	}
	
	/*
	 * The count of odd numbers prior to the kth set is
	 * 1 + 2 + 3 + 4 + ... + (k - 1) = 
	 * cnt = (1 + k - 1)*(k - 1) / 2
	 * e.g., if k = 5; then count of prior numbers = 5 * 4 / 2 = 10
	 * 
	 * Therefore the starting number for the kth set is 
	 * fn = 1 + cnt * 2
	 * E.g., for k = 5; starting numbers is 1 + 10 * 2 = 21
	 * 
	 * The last number of the set is therefore 
	 * ln = (1 + cnt * 2) + (k - 1) * 2
	 * 
	 * THe sum of the elements of the kth set is 
	 * (fn + ln) * k / 2
	 * 
	 * Max Value of k = 10^6 - 1 ~ 10^6
	 * Therefore max value of first element of kth set is ~ 10^6 * 10^6  (order of magnitude)
	 * Therefore the order of magnitude of max value of the sum of the kth set is  10^6 * 10*6 * 10^6
	 * We should therefore use the long data type for the sum
	 */
	public static long sumOfGroup(long k){
		long cnt = (1 + k -1) * (k - 1) / 2;
		long fn = 1 + cnt * 2;
		long ln = fn + (k - 1) * 2;
		return (fn + ln) / 2 * k;
	}
	
	//574575 --> 189_688_139_626_359_375
	//         9_223_372_036_854_775_807
}
