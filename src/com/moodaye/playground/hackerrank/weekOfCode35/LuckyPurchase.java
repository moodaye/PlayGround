package com.moodaye.playground.hackerrank.weekOfCode35;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintWriter;

public class LuckyPurchase {
	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		String name = null;
		String cost = null;
		String bestName = "-1";
		String bestCost = String.valueOf(Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			name = in.next();
			cost = in.next();
			if (cost.matches("^[47]*$") && equals4s7s(cost)) {
				if (cost.length() < bestCost.length()
						|| (cost.length() == bestCost.length() && cost.compareTo(bestCost) < 0)) {
					bestName = name;
					bestCost = cost;
				}
			}
		}
		out.println(bestName);
	}
	
	public static boolean equals4s7s(String s){
		char[] sc = s.toCharArray();
		int seven = 0, four = 0;
		for(char c : sc){
			if(c == '7'){
				seven++;
			}
			else{
				four++;
			}
		}
		return seven == four;
	}

	public static void main(String args[]) {
		new LuckyPurchase().run();

	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}
}
