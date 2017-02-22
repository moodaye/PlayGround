package com.moodaye.playground.algorithms.hackerRank.weekOfCode29;

import java.util.Scanner;

public class DayOfTheProgrammer {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		System.out.println(getDate(y));
	}
	
	private static String getDate(int y){
	
		//check for leap year
		boolean ly = false;
		if ( (y <= 1917) && (y%4 == 0) )
			ly = true;
		else if ((y >= 1919) && ((y%400 == 0) || 
								(y%4 == 0) && (y%100 != 0))){
			
			ly = true;
		}
		
		String date = null;
		if(ly)
			return "12.09." + y;
		else if (y != 1918)
			return "13.09." + y;
		else
			return "26.09." + y;
			
	}

}
