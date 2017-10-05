package com.moodaye.playground;

public class BitWise {
	
	public static void main(String args[]){
		System.out.println(bitToString(23339));
		System.out.println(bitToString(-23339));
		System.out.println(bitToString(-23339>>2));
		System.out.println(bitToString(-23339>>>2));
		
	}
	
	public static String bitToString(int b){
		StringBuffer strb = new StringBuffer();
		for (int i=32; i>=0; i--){
			int mask = 1 << i;
			strb.append((b & mask) != 0 ? "1" : "0");
			if (i%4 == 0) strb.append(" ");
		}
		return strb.toString();
	}
}