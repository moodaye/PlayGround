package com.moodaye.playground.algorithms.hackerRank.projectEuler;

/**
 *If we list all the natural numbers below 10 that are 
 *multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of 
 *these multiples is 23.
 *
 *Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class PE1MultiplesOf3And5 {

	//you can use the formulae for geometric 
	//progressions as well to solve this.
	public static void main(String args[]){

		int max = 1000;
		int i = 1;
		int sum = 0;
		
		while(5*i<max){
			sum += 5*i;
			System.out.println(5*i);
			if (i%5 != 0){
				sum += 3*i; 
				System.out.println(3*i);
			}
			i++;
		}
		while(3*i<max){
			if (i%5 != 0){
				sum += 3*i; 
				System.out.println(3*i);
			}
			i++;
		}
	
		System.out.println(sum);
	}
}
