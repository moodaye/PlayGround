package com.moodaye.playground.algorithms.hackerRank;

import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String args[]){
		while(true){
		Scanner in = new Scanner(System.in);
		String time = in.next();
		if (time.equals("q")) System.exit(0);;

		String strHours = time.substring(0,2);
		int hours = Integer.parseInt(strHours);
		String ampm = time.substring(8,10);
		String minsec = time.substring(2,8);
		
		if (ampm.equals("AM")){
			if (hours == 12){
				strHours = "00";
			}
		}
		else{
			if (hours != 12){
				hours += 12;
			}
			strHours = String.valueOf(hours);
		}
		System.out.println(strHours + minsec);
	}
	}
}
