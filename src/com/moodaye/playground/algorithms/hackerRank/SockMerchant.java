package com.moodaye.playground.algorithms.hackerRank;

import java.util.Scanner;

/**
 * @author Rajiv
 *
 */
public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] sockHolder = new int[100];
		int pairedSocks = 0;
		
		for (int i=0 ; i<n; i++){
			int nextSock = in.nextInt() - 1;
			sockHolder[nextSock]++;
			if (sockHolder[nextSock] == 2){
				pairedSocks++;
				sockHolder[nextSock] = 0;
			}
		}
		System.out.println(pairedSocks);
	}

}
