package com.moodaye.playground.programmersSchool.May2018;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintWriter;

/** Programmer's School #645 */
// Start 6:21pm End 6:31pm -- 10min
public class BeautifulWall {
	void solve(Scanner in, PrintWriter out) {
		int k = in.nextInt();
		// brute force way results in 1 ..... sqrt(k) tests.. we have enough time then to do this
		int minScore = Integer.MAX_VALUE;
		int minH = 0;
		int minW = 0;
		for(int w = 1; w * w <= k; w++){
			int h = k / w;
			int score = (h - w) + (k - h * w);
			if(minScore > score){
				minScore = score;
				minH = h;
				minW = w;
			}
		}
		out.printf("%d %d", minH, minW);
	}

	public static void main(String args[]) {
		new BeautifulWall().run();

	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}
}
