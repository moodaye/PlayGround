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

	/**Insertion sort for collection */
	public static <T> Iterable<T> insertionSort(Iterable<T> t){
		return null;
	}
	
	/**Insertion sort - array of primitives (int) */
	public static void insertionSort(int[] a){
		for (int i=1; i<a.length; i++){
			int temp = a[i];
			int j;
			for (j=i-1; j>=0 && temp<a[j]; j--){
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
	}
	
	/**Selection sort - array of primitives (int) */
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
	
	/**Selection sort - array of primitives (int) */
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
	
	/**Selection sort - Collection */
	public static <T> Iterable<T> bubbleSort(Iterable<T> t){
		return null;
	}

	//QuickSort ************************************************
	
	/** Quick sort - array of primitives */
	public static void quickSort(int[] a){
		//randomize e.g., StdRandom.shuffle(a);
		quickSort(a,0,a.length-1);
		//assert isSorted(a);
	}
	
	private static void quickSort(int[] a, int lo, int hi){
		int index = partition(a, lo, hi);
		if (lo < index -1)
			quickSort(a, lo, index-1);
		if (index < hi)
			quickSort(a, index, hi);
	}

	private static int partition(int[] a, int lo, int hi){
		int pivot = a[(lo+hi)/2];
		while(lo <= hi){
			while(a[lo] < pivot) lo++;
			while(a[hi] > pivot) hi--;
			if(lo<=hi){
				swap(a,lo,hi);
				lo++;
				hi--;
			}
		}
		return lo;
	}
	
	private static void swap(int[] a,int lo,int hi){
		int temp = a[lo];
		a[lo] = a[hi];
		a[hi] = temp;
	}

	public static <T> Iterable<T> quickSort(Iterable<T> t){
		return null;
	}
	
	// ************************************************
	
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
	
	// Heap Sort **************************************
	public static void heapSort(int[] a){
		int n = a.length;
		for (int k = n/2; k>=1; k--)
			sink(a, k, n);
		while(n > 1){
			exch(a, 1, n--);
			sink(a, 1, n);
		}
	}
	
	private static void sink(int[] a, int k, int n){
		while(2*k <= n){
			int j = 2*k;
			if (j < n && less(a, j, j+1)) j++;
			if (!less(a, k, j)) break;
			exch(a, k, j);
			k=j;
		}
	}
	
	private static boolean less(int[] a, int i, int j){
		return a[i-1] -a[j-1] < 0;
	}
	
	private static void exch(int[] a, int i, int j){
		int temp = a[i-1];
		a[i-1] = a[j-1];
		a[j-1] = temp;
	}
	
	public static <T> Iterable<T> heapSort(Iterable<T> t){
		return null;
	}
	// ************************************************

	// Counting Sort***********************************
	/** Also called bucket sort */
	/** assumes input are ints in the inclusive range provided */
	public static void countingSort(int[] a, int range_low, int range_high){
		int[] b = new int[range_high - range_low + 1];
	
		int adjustment = 0; //to deal with negative integers
		if (range_low < 0)
			adjustment = range_low * -1;
			
		
		for (int i=0; i<a.length; i++)
			b[a[i] + adjustment]++;
	
		int j=0;
		for (int i=0; i<b.length; i++)
			while ( b[i]-- > 0)
				a[j++] = i - adjustment;
	}

	// Radix sort ***********************************
	public static void radixSort(int[] a){
		//establish upper bound 	
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
			if (a[i] > max) max = a[i];
		
		//sort by digit.  e.g.,
		// given 9203; 4012; 4839; 8749 
		// after first digit --> 4012; 9203; 4839; 8749
		// after second digit --> 9203; 4012; 4839; 8749
		// after third digit --> 4012; 9203; 8749; 4839
		// after fourth digit --> 4012; 4839; 8749; 9203
		//
		// for each of the above iterations - we can use a counting sort
		// for the ones place - do a % 10
		// e.g., 9203 / 1     = 9203; 9203 % 10 = 3
		//       9203 / 10    = 920;   920 % 10 = 0
		//       9203 / 100   = 92;     92 % 10 = 2
		//       9203 / 1000  = 9;       9 % 10 = 9
	
		int count[];
		for (int exp=1; max/exp > 0; exp *= 10){
			count = new int[10];
			for (int i=0; i<a.length; i++)
				count[(a[i] / exp) % 10]++;
			
			//to get sorted array
			//e.g., if count = {1,0,1,1,0,0,0,0,0,1}
			//then --- cumulative count is {1,1,2,3,3,3,3,3,3,4}
			//cumulative count reflects the index in the sorted array
			for (int i=1; i<10; i++)
				count[i] += count[i-1];
			
			int[] sorted = new int[a.length];
			for(int i = a.length-1; i >= 0; i--){
				sorted[count[(a[i]/exp) % 10] - 1] = a[i];
				count[a[i]/exp % 10]--;
			}
			
			for(int i=0; i < a.length; i++)
				a[i] = sorted[i];
		}
	}
	
	//  ***********************************
}
