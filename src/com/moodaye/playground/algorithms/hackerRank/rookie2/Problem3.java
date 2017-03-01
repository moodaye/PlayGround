package com.moodaye.playground.algorithms.hackerRank.rookie2;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            checkForHackerRank(s);
        }
    }
	
	public static void checkForHackerRank(String s){
		
		char[] checker1 = "hackerrank".toCharArray();
	
		int point = s.indexOf('h');
		for (int i=1; i<checker1.length; i++){
			System.out.println(s.substring(point));
			int c = s.substring(point+1).indexOf(checker1[i]);
			if (c >= 0){
				point += c + 1;
			}
			else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
