package com.moodaye.playground.algorithms.hackerRank;

import java.util.Scanner;

/**
 * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are
 * negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a 
 * new line.
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 * 
 * Input Format
 * 
 * The first line contains an integer, N, denoting the size of the array. 
 * The second line contains  space-separated integers describing an array of numbers .
 * (a0, a1, a2, ..., an-1)
 * 
 * Output Format
 * 
 * You must print the following  lines:
 * 
 * A decimal representing of the fraction of positive numbers in the array.
 * A decimal representing of the fraction of negative numbers in the array.
 * A decimal representing of the fraction of zeroes in the array.
 * Sample Input
 * 
 * 6
 * -4 3 -9 0 4 1         
 * Sample Output
 * 
 * 0.500000
 * 0.333333
 * 0.166667 
 * @author Rajiv
 *
 */
public class PlusMinus {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        int pos = 0;
	        int neg = 0;
	        int zer = 0;
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	            if (arr[arr_i] > 0) pos++;
	            else if (arr[arr_i] < 0) neg++;
	            else zer++;
	        }
	        
	        double pos_pct = (float) pos/n;
	        double neg_pct = (float) neg/n;
	        double zer_pct = (float) zer/n;
	        System.out.printf("%.6f\n", pos_pct);
	        System.out.printf("%.6f\n", neg_pct);
	        System.out.printf("%.6f\n", zer_pct);
	        
	    }
}
