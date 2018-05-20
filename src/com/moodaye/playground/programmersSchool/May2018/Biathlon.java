package com.moodaye.playground.programmerSchool.May2018;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Locale;

/** Programmer's School #440 */
// Start Time = 7:02pm End Time = 7:15pm Time Take = 13min
public class Biathlon {
	void solve(Scanner in, PrintWriter out) {
		int[] x = new int[5];
		int[] y = new int[5];
		
		boolean[] targetIsHit = new boolean[5];
		
		for(int i = 0; i < 5; i++){
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		
		for(int i = 0; i < 5; i++){
			if((x[i] - 0) * (x[i] - 0) + (y[i] - 0) * (y[i] - 0) <= 10 * 10){
				targetIsHit[0] = true;		
			}
			else if((x[i] - 25) * (x[i] - 25) + (y[i] - 0) * (y[i] - 0) <= 10 * 10){
				targetIsHit[1] = true;		
			}
			else if((x[i] - 50) * (x[i] - 50) + (y[i] - 0) * (y[i] - 0) <= 10 * 10){
				targetIsHit[2] = true;		
			}
			else if((x[i] - 75) * (x[i] - 75) + (y[i] - 0) * (y[i] - 0) <= 10 * 10){
				targetIsHit[3] = true;		
			}
			else if((x[i] - 100) * (x[i] - 100) + (y[i] - 0) * (y[i] - 0) <= 10 * 10){
				targetIsHit[4] = true;		
			}
		}
		
		int cnt = 0;
		for(boolean target : targetIsHit){
			if(target){
				cnt++;
			}
		}
		out.println(cnt);
	}

	public static void main(String[] args) {
		new Biathlon().run();
	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}

}
