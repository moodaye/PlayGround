package com.moodaye.playground.algorithms.recursion;

import java.util.Scanner;

/**
 * Came up during an interview.
 * Context was - how to reverse a string. 
 * Upon discussion - it became - how to 
 * reverse w/o looping.
 * @author Rajiv
 *
 */
public class StringReversal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		System.out.println(reverseString(s));

	}
	
	private static String reverseString(String s){
		char[] c = s.toCharArray();
		char[] cout = new char[s.length()];
		cout = swap(c, cout, 0);
		return String.valueOf(cout);
	}
	
	private static char[] swap(char[] in, char[] out, int index){
		if (index == in.length) return out;
		
		out[in.length - index - 1] = in[index];
		index++;
		return swap(in, out, index);
	}
}
