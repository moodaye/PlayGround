package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int x1 = in.nextInt();
	        int v1 = in.nextInt();
	        int x2 = in.nextInt();
	        int v2 = in.nextInt();
	        
	        if (x1 == x2) 
	            if (v1 == v2)
	                System.out.println("YES");
	            else
	                System.out.println("NO");
	        else{
	            if(v1 == v2) 
	                System.out.println("NO");
	            else{
	                
	                if ((x1 < x2 && v1 < v2) || (x2 < x1 && v2 < v1)) 
	                    System.out.println("NO");
	                else{
	                    int a = x2 - x1;
	                    int b = v1 - v2;
	            
	                    if (a % b == 0) 
	                        System.out.println("YES");
	                    else System.out.println("NO");
	                }
	            }
	        }
	    }
	}
