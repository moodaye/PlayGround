package com.moodaye.playground.programmersSchool.May2018;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintWriter;

/** Programmer's School #10 */
public class Equation {
	void solve(Scanner in, PrintWriter out) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		for (int i = -100; i <= 100; i++) {
			if (1L* a * i * i * i + b * i * i + c * i + d == 0L) {
				out.printf("%d ", i);
			}
		}
	}

	public static void main(String args[]) {
		new Equation().run();

	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}
}
