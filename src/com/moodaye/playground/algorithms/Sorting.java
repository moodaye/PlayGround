package com.moodaye.playground.algorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Implementation of the following sorting algorithms
 * Insertion Sort
 * Selection Sort
 * Quick Sort
 * Heap Sort
 * Merge Sort
 * Bubble Sort
 * Count Sort
 * @author Rajiv
 *
 */
public class Sorting<T> {
	
	public static <T> Iterable<T> insertionSort(Iterable<T> t){
		return null;
	}
	public static void insertionSort(int[] a){
		for (int i=0; i<a.length; i++){
			int temp = a[i];
			int j;
			for (j=i-1; j>=0 && temp<a[j]; j--){
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
	}
	
	public static void selectionSort(int[] a){
		for(int i=0; i<a.length-1; i++){
			int index = i;
			for (int j=i+1; j<a.length; j++){
				if(a[j] < a[index])
					index = j;
			}
			int smallerNumber = a[index];
			a[index] = a[i];
			a[i] = smallerNumber;
		}
	}
	public static <T> Iterable<T> selectionSort(Iterable<T> t){
		return null;
	}
	
	public static void bubbleSort(int[] a){
		int j;
		boolean flag = true;
		int temp;
		while(flag){
			flag = false;
			for(j=0; j<a.length; j++ ){
				if(a[j] < a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
		}
	}
	
	public static <T> Iterable<T> bubbleSort(Iterable<T> t){
		return null;
	}
	
	public static void quickSort(int[] a){
		//randomize e.g., StdRandom.shuffle(a);
		quickSort(a,0,a.length-1);
		//assert isSorted(a);
	}
	
	private static void quickSort(int[] a, int lo, int hi){
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		quickSort(a, lo, j-1);
		quickSort(a, j+1, hi);
		//assert isSorted(a, lo, hi);
	}

	// partition the subarray a[lo...hi] so that
	// a[lo..j-1] <= a[j] <= a[j+1..hi]
	private static int partition(int[] a, int lo, int hi){
		int i = lo; 
		int j = hi + 1;
		int v = a[lo];
		while(true){
			break;
			//find item on lo to swap
//			while(less([++i],v))
//				if (i == hi) break;
				
		}
		return 0;
	}

	public static <T> Iterable<T> quickSort(Iterable<T> t){
		return null;
	}
	
	//MERGE ************************************************
	
	/** merge sort implementation for an array of primitives (integers) */
	public static void mergeSort(int[] a){
		int n = a.length;
		
		if (n <= 1) return;
		
		int mid = n/2;
		int[] a_left = new int[mid];
		int[] a_right = new int[mid + n%2];
		
		for (int i=0; i<a_left.length; i++)
			a_left[i] = a[i];
	
		for (int i=0; i<a_right.length; i++)
			a_right[i] = a[mid + i];
		
		mergeSort(a_left);
		mergeSort(a_right);
		merge(a_left, a_right, a);
	}
	
	public static void merge(int[] left, int[] right, int[] a){
		int l = 0;
		int r = 0;
		
		while (l + r < a.length){
			if(r == right.length || 
					(l < left.length && left[l] < right[r]))
				a[l+r] = left[l++];
			else
				a[l+r] = right[r++];
		}
	}
	
	
	
	
	
	/** merge sort implementation using collection of generics */
// 	public static <T> Iterable<T> mergeSort(Iterable<T> s, Comparator<T> comp){
	
	/** merge sort implementation using array of generics */
 	public static <T> void mergeSort(T[] s, Comparator<T> comp){
		int n = s.length;
		if (n < 2) return;
		int mid = n/2;
		//todo - implement this.
		T[] s1 = Arrays.copyOfRange(s, 0, mid);
		T[] s2 = Arrays.copyOfRange(s, mid, n);
		mergeSort(s1, comp);
		mergeSort(s2, comp);
		merge(s1,s2, s, comp);
	}

	/** merge contents of s1 and s2 into properly sized array s */
	public static <K> void merge(K[] s1, K[] s2, K[] s, Comparator<K> comp){
		int i = 0, j = 0;
		while(i + j < s.length){
			if(j == s2.length || 
					(i < s1.length && comp.compare(s1[i], s2[j]) < 0))
				s[i+j] = s1[i++]; // copy ith element of s1 and incr. i
			else
				s[i+j] = s2[j++]; // copy jth element of s1 and incr. j
		}
	}
	
	// ************************************************
	
	public static int[] heapSort(int[] a){
		return a;
	}
	public static <T> Iterable<T> heapSort(Iterable<T> t){
		return null;
	}
	
	public static int[] countingSort(int[] a){
		return a;
	}
	public static <T> Iterable<T> countingSort(Iterable<T> t){
		return null;
	}
	
	public static int[] radixSort(int[] a){
		return a;
	}
	public static <T> Iterable<T> radixSort(Iterable<T> t){
		return null;
	}
	

}
