package com.moodaye.playground.hackerrank.WorldCodeprint12;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;
import java.io.PrintWriter;

public class TheSalesman {
	
	public static int minimumTime(int[] x){
		Arrays.sort(x);
		return x[x.length - 1] - x[0];
	}
	
	void solve(Scanner in, PrintWriter out) {
		int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] x = new int[n];
            for(int x_i = 0; x_i < n; x_i++){
                x[x_i] = in.nextInt();
            }
            int result = minimumTime(x);
            System.out.println(result);
        }
        in.close();
	}

	public static void main(String args[]) {
		new TheSalesman().run();

	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}
}
