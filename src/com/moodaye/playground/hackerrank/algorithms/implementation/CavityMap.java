package com.moodaye.playground.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CavityMap {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        int[][] ngrid = new int[n][n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
            for(int j=0; j<n; j++){
                ngrid[grid_i][j] = Integer.valueOf(grid[grid_i].substring(j,j+1));
            }
        }
        
        boolean[][] x = new boolean[n][n];
        
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
        	 if(i>0 && j>0 && i<n-1 && j<n-1){
        		 if( (ngrid[i-1][j] < ngrid[i][j])
        			&& (ngrid[i][j-1] < ngrid[i][j])
        			&& (ngrid[i+1][j] < ngrid[i][j])
                    && (ngrid[i][j+1] < ngrid[i][j]) )
        			System.out.print("X");
        		 else
        			System.out.print(ngrid[i][j]);
        	 }
             else
               System.out.print(ngrid[i][j]);
           }
           System.out.println();
         }
    }

}
