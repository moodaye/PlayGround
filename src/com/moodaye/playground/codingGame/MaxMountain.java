package com.moodaye.playground.codingGame;

import java.util.Scanner;

public class MaxMountain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
    	int index = -1;
    	while (true) {
    	    for (int i = 0; i < 8; i++) {
    	        int mountainH = in.nextInt();
    	        if (mountainH > max) {
    	            index = i;
    	            max = mountainH;
    	        }// represents the height of one mountain.
    	    }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(index); // The index of the mountain to fire on.
    	}
	}
}
