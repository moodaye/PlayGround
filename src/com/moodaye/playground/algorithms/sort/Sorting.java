package com.moodaye.playground.algorithms.sort;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = {1,-1,0,-1};
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}
	
	public static void insertionSort(int[] in){
		for (int i=1; i<in.length; i++){
			for (int j=i-1; j>=0; j--){
				if(in[j+1] < in[j]){
					int temp = in[j];
					in[j] = in[j+1];
					in[j+1] = temp;
				}
			}
		}
	}
}
