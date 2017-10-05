package com.moodaye.playground.hackerrank.hourrank18;

import java.util.Scanner;

public class SuperSixSubStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int sumNow = 0;
        int grandCount = 0;
        int zeroCount = 0;
        int currDigit = 0;
        boolean prevDigitZero = false;
        for (int i=0; i<s.length(); i++){
            String sub = s.substring(i,i+1);
            currDigit = Integer.valueOf(sub);
            sumNow += currDigit;
            
            
            if(sumNow % 2 == 0 && sumNow % 3 == 0){
                sumNow = 0;
                if(!prevDigitZero){
                  grandCount = grandCount*2 + 1 + zeroCount; 
                  zeroCount = 0;
                }
                else{
                    zeroCount += grandCount * 2;
                }
            }
            if(currDigit == 0)
            	prevDigitZero = true;
            else
            	prevDigitZero = false;
        }
        System.out.println(grandCount);
    }
}
