package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        System.out.println(takeStep(c, 0, 0));
        
    }
    
    private static int takeStep(int[] c, int nextNo, int stepCnt){
        if (nextNo == c.length) return -1;
        if (c[nextNo] == 1) return -1;
        if (nextNo == c.length-1) return stepCnt;
        
        ++stepCnt; 
        int option1 = takeStep(c, nextNo+1, stepCnt);
        int option2 = takeStep(c, nextNo+2, stepCnt);
       
        if(option1 == -1){
        	if(option2 == -1)
        		return -1;
        	else
        		return option2;
        }
        
        if(option2 == -1){
        	return option1;
        }
        
        return (option1 < option2 ? option1 : option2);
    }
}
