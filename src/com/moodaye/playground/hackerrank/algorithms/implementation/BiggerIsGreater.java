package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BiggerIsGreater {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int i=0; i<t; i++){
	            String s = in.next(); 
	            printBig(s); 
	        }
	    }
	    private static void printBig(String s){
	       char[] carr = s.toCharArray();
	       boolean found = false;
	       int index = -1;
	       for (int i = s.length()-1; i>=0; i--){
	           char c = carr[i];
	           for (int j=i-1; j>=0; j--){
	               if (c > carr[j]){
	                  char temp = carr[j];
	                  carr[j] = c;
	                  carr[i] = temp; 
	                  index = j;
	               found = true;
	               break;
	               }
	           }
	           if (found) break;
	       }
	        
	        if(!found) System.out.println("no answer");
	        else{
	            for (int i=index+1; i<=s.length()-2; i++){
	                for (int j=i+1; j<=s.length()-1; j++) {
	                    if(carr[i]>carr[j]){
	                        char temp = carr[i];
	                        carr[i] = carr[j];
	                        carr[j] = temp;
	                    }
	                }
	            }
	            System.out.println(String.valueOf(carr));
	        }
	}
}
