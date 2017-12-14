package com.moodaye.playground.algorithms.hackerRank.dynamicProgramming;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class SherlockAndCost {
	void solve(Scanner in, PrintWriter out){
		int T = in.nextInt();
		int N = in.nextInt();
		for(int i = 0; i < T; i++){
			int[] a = new int[N];
			for(int j = 0; j < N; j++){
				a[j] = in.nextInt();
			}
			out.println(compute(a));
		}
	}
	
	public static int compute(int[] a){
		int max1 = 0;
		int max2 = 0;
		for(int i = 1; i < a.length; i++){
			if(i % 2 == 0){
				max1 += Math.abs(a[i] - 1);
				max2 += Math.abs(a[i-1] - 1);
			}
			else{
				max1 += Math.abs(a[i-1] - 1);
				max2 += Math.abs(a[i] - 1);
			}
		}
		return max1 > max2 ? max1 : max2;
	}
	
	public static void main(String[] args) {
		new SherlockAndCost().run();
	}
	
	void run(){
		Locale.setDefault(Locale.US);
		try(Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)){
			solve(in,out);
		}
	}

}
