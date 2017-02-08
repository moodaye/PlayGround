package com.moodaye.playground.algorithms.hackerRank;

public class InsertionSort1 {
	
	public static void main(String args[]){
//		int[] array = {2,3,4,6,8,3};
		int[] array = {2,4,4,6,8,3};
//		int[] array = {1,0};
//		int[] array = {2,4,6,8,3};
//		int[] array = {3};
		insertIntoSorted(array);
	}

	 public static void insertIntoSorted(int[] ar) {
	        int size = ar.length;
	        if (size == 1){
	        	printArray(ar);
	        	return;
	        }
	        int temp = ar[size-1]; 
	        ar[size-1] = ar[size-2];
	        
	        for (int i=size-2; i>-1; i--){
	            if (temp < ar[i]){
	                printArray(ar);
	                if (i == 0){
	                	ar[i] = temp;
	                	printArray(ar);
	                }
	                else{
	                	ar[i] = ar[i-1];
	                }
	            }
	            else{
	                ar[i+1] = temp;
	                printArray(ar);
	                break;
	            }
	        }       
	       
	    }
	 
	    private static void printArray(int[] ar){
	        for (int i=0; i<ar.length; i++){
	            System.out.print(ar[i] + " ");
	        }
	        System.out.println();
	    }	
	
	
}
