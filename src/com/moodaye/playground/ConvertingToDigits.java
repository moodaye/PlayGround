package com.moodaye.playground;

public class ConvertingToDigits {

	/*
	 * Returns an array of ints with each element
	 * representing the respective character of the 
	 * String. E.g., 143 returns [1][4][3]
	 */
	public static int[] stringToDigits(String str){
		int[] nstr = new int[str.length()];
		
		for(int i=0; i<nstr.length; i++){
			nstr[i] = Integer.valueOf(str.substring(i,i+1));
		}
		return nstr;
	}
	
	public static int[] integerToDigits(int num){
		return stringToDigits(Integer.toString(num));
	}
}
