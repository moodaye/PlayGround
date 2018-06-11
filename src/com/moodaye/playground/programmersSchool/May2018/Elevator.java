package com.moodaye.playground.programmersSchool.May2018;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintWriter;

/** Programmer's School #336 */
// Start = 1005pm End = 10:12pm  Time Taken = 7min
public class Elevator {
	void solve(Scanner in, PrintWriter out) {
		String p = in.next();
		int max = 0;
		int min = 0;
		int cnt = 0;
		for(char c : p.toCharArray()){
			cnt += c == '1' ? 1 : -1;
			max = Math.max(max, cnt);
			min = Math.min(min, cnt);
		}
		out.println(max - min + 1);
		
	}
	public static void main(String args[]) {
		new Elevator().run();

	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}
}
