package com.moodaye.playground.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int V = in.nextInt();
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        
	        for (int i=0; i<n; i++){
	            ar[i] = in.nextInt();     
	        }
	        
	        //binary search
	        int left = 0;
	        int right = n-1;
	        int index = n/2;
	        while(true){
	            if (V == ar[index]) break;
	            if (V < ar[index]){
	                right = index;
	                index = (index + left)/2;
	            } 
	            else{
	                left = index;
	                index = (right - index)/2;
	            } 
	        }
	        System.out.println(index);
	    }
}
