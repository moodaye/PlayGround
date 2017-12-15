package com.moodaye.playground.hackerrank.WorldCodeprint12;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintWriter;

public class RedKnightsShortestPath {
	public static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
		// We use a grid boolean[][] to track squares that have already been
		// visited.
		boolean[][] visited = new boolean[n][n];
		Square start = new Square();
		start.i = i_start;
		start.j = j_start;

		Square end = new Square();
		end.i = i_end;
		end.j = j_end;

		int minSteps = getPath(visited, start, end, 0, -1000);
		if(minSteps == -1){
			System.out.println("Impossible");
		}
		else{
			System.out.println(minSteps);
			Square path = start;
			while(path.next != null){
				System.out.print(path.step + " ");
			}
		}
	}

	private static int getPath(boolean[][] visited, Square start, Square end, int minSteps, int currMin) {
		if (start.equals(end)) {
			return currMin;
		}
		if (currMin >= minSteps - 1) {
			return -1;
		}
		currMin++;

		Square next = null;

		for (int s = 0; s < 6; s++) {
			switch (s) {
			case (0):
				next = UL(start);
				break;
			case (1):
				next = UR(start);
				break;
			case (2):
				next = R(start);
				break;
			case (3):
				next = LR(start);
				break;
			case (4):
				next = LL(start);
				break;
			case (5):
				next = L(start);
				break;
			}
			if (isValid(next, visited)) {
				visited[next.i][next.j] = true;
				int steps = getPath(visited, next, end, minSteps, currMin);
				if (steps != -1) {
					return steps;
				}
			}
		}
		return -1;
	}

	private static boolean isValid(Square sq, boolean[][] visited) {
		if (sq.i >= 0 && sq.i <= visited.length - 1 && sq.j >= 0 && sq.j <= visited.length - 1
				&& !visited[sq.i][sq.j]) {
			return true;
		}
		return false;
	}

	private static Square UL(Square sq) {
		Square next = new Square();
		next.i = sq.i - 1;
		next.j = sq.j + 2;
		sq.next = next;
		next.prev = sq;
		next.step = "UL";
		return next;
	}

	private static Square UR(Square sq) {
		Square next = new Square();
		next.i = sq.i + 1;
		next.j = sq.j + 2;
		sq.next = next;
		next.prev = sq;
		next.step = "UR";
		return next;
	}

	private static Square R(Square sq) {
		Square next = new Square();
		next.i = sq.i + 2;
		next.j = sq.j;
		sq.next = next;
		next.prev = sq;
		next.step = "R";
		return next;
	}

	private static Square LR(Square sq) {
		Square next = new Square();
		next.i = sq.i + 1;
		next.j = sq.j - 2;
		sq.next = next;
		next.prev = sq;
		next.step = "LR";
		return next;
	}

	private static Square LL(Square sq) {
		Square next = new Square();
		next.i = sq.i - 1;
		next.j = sq.j - 2;
		sq.next = next;
		next.step = "LL";
		return next;
	}

	private static Square L(Square sq) {
		Square next = new Square();
		next.i = sq.i - 2;
		next.j = sq.j;
		sq.next = next;
		next.step = "L";
		return next;
	}

	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int i_start = in.nextInt();
		int j_start = in.nextInt();
		int i_end = in.nextInt();
		int j_end = in.nextInt();
		int[][] grid = new int[n][n];
		printShortestPath(n, i_start, j_start, i_end, j_end);
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

class Square {
	int i;
	int j;
	Square next;
	Square prev;
	String step = null;
	boolean equals(Square o){
		if(o.i == i && o.j == j){
			return true;
		}
		return false;
	}
}
