package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DesignedPDFViewer {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int mxh = 0;
        char[] cword = word.toCharArray();
        for (int i=0; i<cword.length; i++){
           int currh = getHeight(cword[i], h);
           if(currh > mxh)
               mxh = currh;
        }
        System.out.println(mxh*word.length());
    }
	
	private static int getHeight2(char c, int[] h){
		int height = 0;
		switch(c){
			case 'a': height = 10000;
				break;
			case 'b': height = 2;
				break;
		}
		return height;
	}
    
    private static int getHeight(char c, int[] hh){
        int height = 0;
        switch(c){
            case 'a': height = hh[0];
            			break;
            case 'b': height = hh[1];
            			break;
            case 'c': height = hh[2];
            			break;
            case 'd': height = hh[3];
            			break;
            case 'e': height = hh[4];
            			break;
            case 'f': height = hh[5];
            			break;
            case 'g': height = hh[6];
            			break;
            case 'h': height = hh[7];
            			break;
            case 'i': height = hh[8];
            			break;
            case 'j': height = hh[9]; 
            			break;
            case 'k': height = hh[10];
            			break;
            case 'l': height = hh[11];
            			break;
            case 'm': height = hh[12];
            			break;
            case 'n': height = hh[13];
            			break;
            case 'o': height = hh[14];
            			break;
            case 'p': height = hh[15];
            			break;
            case 'q': height = hh[16];
            			break;
            case 'r': height = hh[17];
            			break;
            case 's': height = hh[18];
            			break;
            case 't': height = hh[19];
            			break;
            case 'u': height = hh[20];
            			break;
            case 'v': height = hh[21];
            			break;
            case 'w': height = hh[22];
            			break;
            case 'x': height = hh[23];
            			break;
            case 'y': height = hh[24];
            			break;
            case 'z': height = hh[25];
                      break; 
        } 
        return height;
    }
}
