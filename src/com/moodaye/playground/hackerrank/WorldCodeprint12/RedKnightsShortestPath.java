package com.moodaye.playground.hackerrank.WorldCodeprint12;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintWriter;

public class RedKnightsShortestPath {
	public static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end){
		//We go depth first in the given order of priority.
		//We backtrack when we hit a square that lies outside the grid; or one that has already
		//been visited; or when the number of steps exceeds the shortest path computed thus far
		//Actually - minThusFar - 1 since we need to eval in order of priority.
		
	}
	
	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int i_start = in.nextInt();
		int j_start = in.nextInt();
		int i_end = in.nextInt();
		int j_end = in.nextInt();
		int[][] grid = new int[n][n];
	}

	public static void main(String args[]) {
		new RedKnightsShortestPath().run();
	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}
}

class Square{
	int x;
	int y;
	Square next;
}
