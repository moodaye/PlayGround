package com.moodaye.playground.algorithms.hackerRank.rookie2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortingOrderString {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<String> sa = new TreeSet<>();
		for(int i=0; i<n; i++){
			sa.add(in.next());
		}
		System.out.println(sa);
	}
}
