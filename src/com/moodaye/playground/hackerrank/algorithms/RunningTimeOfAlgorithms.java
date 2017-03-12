package com.moodaye.playground.hackerrank.algorithms;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
       
        int cnt = 0;
        for (int i=1; i<n; i++) {
            int temp = a[i];
            int j;
            for (j=i-1; j>=0 && temp < a[j]; j--){
               a[j+1] = a[j];
               cnt++;
            }
            a[j+1] = temp;
        }
        
        System.out.println(cnt);
    }
}
