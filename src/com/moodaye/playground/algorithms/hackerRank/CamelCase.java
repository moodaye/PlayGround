package com.moodaye.playground.algorithms.hackerRank;

import java.util.Scanner;

/*
 * Count words in a concatenated set of words.
 * Words are camelcase except for the first word which is all lowercase
 */
public class CamelCase {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		
		char[] c = s.toCharArray();
	
		int count = 1;
		for (int i=0; i<c.length; i++){
			int j = c[i];
			if (j >= 65 && j <= 90 ) 
				count++;
		}
		System.out.println(count);
		
	}

}
