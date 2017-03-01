package com.moodaye.playground.algorithms.hackerRank.rookie2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextLong();
        }
      
        long min = Long.MAX_VALUE;
        Arrays.sort(a);
        for (int i=0; i<n-1; i++){
            	long abs_diff = Math.abs(a[i] - a[i+1]) ;
               if(abs_diff < min) {
            	   min = abs_diff;
               }
            }
        System.out.println(min);
    }
}
