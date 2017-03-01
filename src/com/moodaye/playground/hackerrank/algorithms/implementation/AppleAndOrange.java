package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.io.File;
import java.util.Scanner;

public class AppleAndOrange {

	    public static void main(String[] args) throws Exception{
	        Scanner in = new Scanner(new File("c:\\temp\\apor.txt"));
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        int[] apple = new int[m];
	        for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	        }
	        int[] orange = new int[n];
	        for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	        }
	        int cnta = 0; 
	        for (int ap=0; ap<apple.length; ap++){
	            if (a + apple[ap] >= s && a + apple[ap] <= t) cnta++;
	            
	        }
	        int cnto = 0; 
	        for (int o=0; o<orange.length; o++){
	            if (b + orange[o] <= t && b + orange[o] >= s) cnto++;
	        }
	        System.out.println(cnta);
	        System.out.println(cnto);
	    }
}
