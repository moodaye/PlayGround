package com.moodaye.playground.algorithms.sort;



/**
 * Follows metaphor of how cards are picked up inserted into hand. 
 * Data structure - array or linked list. Let's do both.
 * 
 * Start with integers then move to generics.
 * @author Rajiv Kewalramani
 *
 */
public class InsertionSort {
	
	public static int[] sort(int[] a){
		int[] b = new int[a.length];
	
		for (int i=0; i<a.length; i++){
			for(int j=0; j<=i; j--){
				if(j==i){
					b[j] = a[i];
					break;
				}
				//insert element
				if(b[j] >= a[i]){
					int temp = b[j];
					b[j] = a[i];
					for (int k=j+1; k<=i; k++){
						int temp2 = b[k];
						b[k] = b[k-1];
						b[k-1] = temp2;
					}
					
				}
			}
			
		}
		
		
		return a;
	}
}
