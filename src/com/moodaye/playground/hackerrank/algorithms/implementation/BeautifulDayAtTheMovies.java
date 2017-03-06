package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BeautifulDayAtTheMovies {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        
       int cnt = 0; 
        for (int m=i; m<=j; m++){
            int reverseM = reverse(m);
            if ((m-reverseM)%k == 0) cnt++;
        }
        System.out.println(cnt);
    }
    
    private static int reverse(int m){
        char[] cm = String.valueOf(m).toCharArray();
       
        for (int i=0; i<=(cm.length-1)/2; i++){
            char temp = cm[i];
            cm[i] = cm[cm.length-1-i];
            cm[cm.length-1-i] = temp;
        }
        return Integer.valueOf(String.valueOf(cm));
    }
}
