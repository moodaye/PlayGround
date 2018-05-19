package com.moodaye.playground.programmersSchool.May2018;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;
import java.io.PrintWriter;

/** Programmer's School #693 Diff 24% */
// Start Time = 11:18pm  Finish Time 11:31pm Time Taken = 13min
public class Anagram {
	void solve(Scanner in, PrintWriter out) {
		char[] c1 = in.next().toLowerCase().toCharArray();
		char[] c2 = in.next().toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		out.println(Arrays.equals(c1, c2) ? "Yes" : "No");
	}
	

	public static void main(String args[]) {
		new Anagram().run();

	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}
}
