package com.moodaye.playground.algorithms.hackerRank;

import java.util.Scanner;
import java.util.TreeSet;
/**
 * 
 * @author Rajiv Kewalramani
 *
 */
public class HackerlandRadioTransmitter {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        TreeSet<Integer> ts = new TreeSet<>();
	        for(int x_i=0; x_i < n; x_i++){
	            ts.add(in.nextInt());
	        }
	        System.out.println(numberOfTransmitters(ts, k));
	    }
	  
	    public static int numberOfTransmitters(TreeSet<Integer> ts, int k){
	    	Integer nextHome = 0;
	    	Integer nextTrans = 0;
	        int count = 0;

	        nextHome = ts.ceiling(nextHome);
	    	
	        while(null != nextHome){
		    	nextTrans = ts.floor(nextHome + k);
	        	count++;
	        	nextHome = ts.ceiling(nextTrans + k + 1);
	        }
	        return count;
	    }
}