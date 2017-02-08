package com.moodaye.playground.algorithms.hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] fiveNumbers = new long[5];
        fiveNumbers[0] = in.nextLong();
        fiveNumbers[1] = in.nextLong();
        fiveNumbers[2] = in.nextLong();
        fiveNumbers[3] = in.nextLong();
        fiveNumbers[4] = in.nextLong();
        
        Arrays.sort(fiveNumbers);            
        long min=0;
        long max=0;
        
        for (int i=0; i<fiveNumbers.length; i++) {
        	if (i==0){
        		min+=fiveNumbers[i];
        		continue;
        	}
        	if(i==4){
        		max+=fiveNumbers[i];
        		continue;
        	}
        	min+=fiveNumbers[i];
        	max+=fiveNumbers[i];
        }
        
        System.out.println(min + " " + max);
    
    }
}