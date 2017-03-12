package com.moodaye.playground;

public class SortingPractice {
	
	public static void main(String[] args) {
		int a[] = {30,21,333,2,10,2045,2013,102};
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ", ");
		}
		System.out.println();
		
//		mergeSort(a);
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ", ");
		}
		System.out.println();
		
	}
	
	public static void heapSort(int[] a){
		//heapify the array
		int n = a.length;
		
		for(int k=n/2; k<=1; k--)
			sink(a,k,n);
		
		//remove root and sink
		
		
	}
	
	private static void sink(int[] a, int k, int n){
		while(2*k <= n){
			int j=2*k;
		}
	}
	
	private void exch(int[] a, int i, int j){
		int temp = a[i-1];
		a[i-1] = a[j-1];
		a[j-1] = temp;
	}
	
	private boolean less(int[] a, int i, int j){
		return (a[i-1] - a[j-1] < 0);
	}
	
}
	
