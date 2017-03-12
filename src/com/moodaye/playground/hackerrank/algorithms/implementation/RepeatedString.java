package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class RepeatedString {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        long n = in.nextLong();
	        
	        int acnt = 0;
	        char[] chs = s.toCharArray();
	        
	        long rem = n % s.length(); 
	        int remcnt = 0;
	        long numRepeats = n / s.length();

	        for (int i=0; i<chs.length; i++){
	            if (chs[i] == 'a'){
	                acnt++;        
	                if (i < rem) remcnt++;
	            }
	        }
	        System.out.println(acnt*numRepeats + remcnt);
	    }        
}
