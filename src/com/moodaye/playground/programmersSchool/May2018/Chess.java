package com.moodaye.playground.programmersSchool.May2018;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintWriter;

/** Programmer's School #6 */
// Start Time = 455am  End Time = 5:07am (12min)
public class Chess {
	void solve(Scanner in, PrintWriter out) {
		String move = in.next();
		if(move.length() != 5){
			out.println("ERROR");
			return;
		}
		if(!('A' <= move.charAt(0) && move.charAt(0) <= 'H')
		  || !('A' <= move.charAt(3) && move.charAt(3) <= 'H')){
			out.println("ERROR");
			return;
		}
		
		if(!('1' <= move.charAt(1) && move.charAt(1) <= '8')
		  || !('1' <= move.charAt(4) && move.charAt(4) <= '8')){
			out.println("ERROR");
			return;
		}
		if(move.charAt(2) != '-'){
			out.println("ERROR");
			return;
		}
		
		int dx = move.charAt(0) - move.charAt(3);
		int dy = move.charAt(1) - move.charAt(4);
		
		if(dx *dx == 1){
			if(dy*dy == 4){
				out.println("YES");
			}
		}
		else if(dx *dx == 4){
			if(dy*dy == 1){
				out.println("YES");
			}
		}
		else{
			out.println("NO");
		}
	}

	public static void main(String args[]) {
		new Chess().run();

	}

	void run() {
		Locale.setDefault(Locale.US);
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			solve(in, out);
		}
	}
}
