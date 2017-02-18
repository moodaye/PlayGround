package com.moodaye.playground.algorithms.hackerRank.universityCodeSprint2;

/**
 * @author Rajiv Kewalramani
 * 
 * Algorithm
 * ---------
 * s; index=0; anchor=-1; firstNum=-1;
 * anchor = s[0]
 * 
 * if anchor == 0 
 * 		firstNum = anchor;
 * 		yesNo(s,index,anchor)
 * else
 * 		while(getNextChar == 0)
 * 			index++
 * anchor = anchor * ((int) Math.pow(10, index))
 * fistNum = anchor
 * yesNo(s,index,anchor)
 *
 *
 *String yesNo(s,index,anchor)
 *		anchor += 1; index++;
 *		while ( index = s.indexOf(anchor, index) )
 *			index += String.valueOf(++anchor);
 *			if (index = s.length-1)
 *				return "YES" +  " " + firstNum;
 *		return "NO";
 *
 */
public class SeparateTheNumbers {
	
	public static String yesNo(String s){
		int index = 0;
		int anchor = -1;
		int firstNum = -1;
		
		anchor = Integer.valueOf(s.substring(index));
		if (anchor == 0){
			firstNum = anchor;
		}
		else{
			//regex?? //char??
			while(s.substring(index+1, index+2).equals("0")){
				index++;
			}
			anchor = anchor * ((int) Math.pow(10, index));
			firstNum = anchor;
		}
		
		anchor++;
		index++;
	/*	while(index == s.indexOf(anchor, index))
			index += String.valueOf(++anchor);
		
		*/
		
		
		
		
		
		
		return "NO";
	}

}
