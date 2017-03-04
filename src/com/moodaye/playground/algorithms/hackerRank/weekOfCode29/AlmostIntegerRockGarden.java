package com.moodaye.playground.algorithms.hackerRank.weekOfCode29;

public class AlmostIntegerRockGarden {

	
	public static void main (String args[]){

		double threshold = 0.000000000001; 
		
		for (int i=1; i<=12; i++){
			for (int j=1; j<=12; j++){
				double sqrt = Math.sqrt(i*i + j*j);
				double closestInt = Math.rint(sqrt);
				if(Math.abs((closestInt - sqrt)) < threshold){
			//		System.out.println(i + "^2 + " + j + "^2 = " + sqrt + " ---- closest int is " + closestInt);
				}
				else
					System.out.println(closestInt - sqrt);
			}
		}
		
		
		
	}
	
	
}
