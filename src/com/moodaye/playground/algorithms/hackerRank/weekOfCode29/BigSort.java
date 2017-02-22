package com.moodaye.playground.algorithms.hackerRank.weekOfCode29;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//4 seconds to sort - 26 seconds end 2 end - 5,242,880 strings from file.
//4 seconds to sort - 28 seconds end 2 end - 5,242,880 strings from file.
public class BigSort {
	    public static void main(String[] args) throws Exception{
	    	
	    	Scanner in = new Scanner ( new File("c:\\temp\\dummy2.txt"));
	        //Scanner in = new Scanner(System.in);
	        //int n = in.nextInt();
	    	int n = 5242880;
	    	long startTime = System.currentTimeMillis();
	        String[] unsorted = new String[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	        }
	        Arrays.sort(unsorted, new Comparator<String>(){
	        
	        	
				@Override
				public int compare(String s1, String s2) {
					if(s1.length() > s2.length()){
						return 1;
					}
					else if(s1.length() < s2.length()){
						return -1;
					}
					return s1.compareTo(s2);
				}
	        	
	        	
	        });
	    	long sortTime = System.currentTimeMillis();
	        for (int i=0; i<unsorted.length; i++){
	            System.out.println(unsorted[i]);
	        }
	    	long endTime = System.currentTimeMillis();
	    	
	    	System.out.println("sort time = " + (sortTime - startTime)/1000 + " seconds" );
	    	System.out.println("total time = " + (endTime - startTime)/1000 + " seconds" );
	    	
	    }
	}
