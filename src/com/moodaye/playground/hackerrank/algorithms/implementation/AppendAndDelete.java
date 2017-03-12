package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppendAndDelete {
	 public static void main(String[] args) {
	        
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        
	        for (int i = 0; i<t; i++){
	            
	            int A = in.nextInt();
	            int B = in.nextInt();
	            
	            int index = (int) Math.sqrt(A);
	            int count = 0; 
	            
	            while (index*index < A)
	            	index++;
	            
	            while (index * index++ <= B)
	                count++;
	            
	            System.out.println(count) ;
	            
	        }
	    }	
}
