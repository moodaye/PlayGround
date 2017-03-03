package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class EqualizeTheArray {
	 public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       int n = in.nextInt(); 
	       int counter[] = new int[101];
	        int prevNum = 0;
	        for (int i=0; i<n; i++){
	            int a = in.nextInt();
	            counter[a]++;
	        }
	        
	        int maxCount = 0; 
	        int maxCountIndex = -1;
	        for (int i=0; i<101; i++){
	           if(counter[i] > maxCount) {
	               maxCount = counter[i];
	               maxCountIndex = i;
	           }
	        }
	        
	        boolean areAlreadyEqual = true;
	        for (int i=0; i<100; i++){
	            if (counter[i] != maxCount && counter[i] != 0){
	                areAlreadyEqual = false;
	                break;
	            }
	        }
	        
	        if(areAlreadyEqual)
	            System.out.println(n-1);
	        else
	            System.out.println(n-maxCount);
	    }
}
