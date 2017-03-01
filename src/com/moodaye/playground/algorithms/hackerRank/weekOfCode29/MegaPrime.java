package com.moodaye.playground.algorithms.hackerRank.weekOfCode29;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MegaPrime {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int last = in.nextInt();
		
		int[] isPrime = new int[last+1];
		isPrime[0] = 1;
		isPrime[1] = 1;
		for(int i=2; i<=last; i++){
		
			if(isPrime[i]==0){
				for (int j=i; j*i<=last; j++){
					isPrime[i*j] = 1;
				}
			}
		}
		int count = 0;
		Pattern pattern = Pattern.compile("[014689]");
		for(int i=first; i<=last; i++){
			if(isPrime[i] == 0 && !pattern.matcher(String.valueOf(i)).find()){
				count++;
			}
		}
		System.out.println(count);
	}
}
