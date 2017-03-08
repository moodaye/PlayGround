package com.moodaye.playground.algorithms;

import static org.junit.Assert.*;
import java.util.Comparator;
import org.junit.Test;

public class SortingTest {
	
	@Test
	public void testRadixSort(){
		int[] a = {4,3,2,1};
		Sorting.radixSort(a);
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected, a);
		
		int[] a2 = {2,1,4,3};
		Sorting.radixSort(a2);
		int[] expected2 = {1,2,3,4};
		assertArrayEquals(expected2, a2);
		
		int[] a3 = {1923, 39, 4900, 3091, 233};
		Sorting.radixSort(a3);
		int[] expected3 = {39, 233, 1923, 3091, 4900};
		assertArrayEquals(expected3, a3);
		
		int[] a4 = {0};
		Sorting.radixSort(a4);
		int[] expected4 = {0};
		assertArrayEquals(expected4, a4);
		
		int[] a5 = {-120, 20, 222, -1};
		Sorting.radixSort(a5);
		int[] expected5 = {-120, -1, 20, 222};
		assertArrayEquals(expected5, a5);
	}
	
	@Test
	public void testHeapSort1(){
		int[] a = {4,3,2,1};
		Sorting.heapSort(a);
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected, a);
		
		int[] a2 = {2,1,4,3};
		Sorting.heapSort(a2);
		int[] expected2 = {1,2,3,4};
		assertArrayEquals(expected2, a2);
	}
	
	@Test
	public void testCountingSort1(){
		int[] a = {4,3,1};
		Sorting.countingSort(a,  0,  10);
		int[] expected = {1,3,4};
		assertArrayEquals(expected, a);
		
		int[] b = {10,-1, 2, 2, 4, 5};
		Sorting.countingSort(b, -1, 10);
		int[] b_expected = {-1,2,2,4,5,10};
		assertArrayEquals(b_expected, b);
	}
	
	@Test
	public void testQuickSort(){
		int[] a = {4,3,1};
		Sorting.quickSort(a);
		int[] expected = {1,3,4};
		assertArrayEquals(expected, a);
		
		int[] b = {10,-1, 2, 2, 4, 5};
		Sorting.quickSort(b);
		int[] b_expected = {-1,2,2,4,5,10};
		assertArrayEquals(b_expected, b);
	}
	
	@Test 
	public void testMergeSortArrayOfInts(){
		int[] a = {3,1,2};
		int[] a_needed = {1,2,3};
		Sorting.mergeSort(a);
		assertArrayEquals(a_needed,a);
		
		int[] b = {3};
		int[] b_needed = {3};
		Sorting.mergeSort(b);
		assertArrayEquals(b_needed,b);
		
		int[] c = {3,3};
		int[] c_needed = {3,3};
		Sorting.mergeSort(c);
		assertArrayEquals(c_needed,c);

		int[] d = {100,0,-1,-120, 3,-1};
		int[] d_needed = {-120,-1,-1,0,3,100};
		Sorting.mergeSort(d);
		assertArrayEquals(d_needed,d);
	}
	
	@Test
	public void testMergeSortArrayOfGenerics1(){
		String s_1[] = {"Rajiv", "Kavita", "Ronnie", "Tasha", "Alisha"};
		Sorting.<String>mergeSort(s_1, new Comparator<String>(){
			public int compare(String s1, String s2){
				return s1.compareTo(s2);
			}
		});
		String[] s_needed = {"Alisha", "Kavita", "Rajiv", "Ronnie", "Tasha"};
		assertArrayEquals(s_1, s_needed);
		
		String s_2[] = {"Rajiv"};
		String[] s_2_needed = {"Rajiv"};
		Sorting.<String>mergeSort(s_2, new Comparator<String>(){
			public int compare(String s1, String s2){
				return s1.compareTo(s2);
			}
		});
		assertArrayEquals(s_2, s_2_needed);
	}

	@Test
	public void test1() {
		int[] a = {4,3,2,19};
		Sorting.insertionSort(a);
	//	printArray(a);
	}
	
	private void printArray(int[] a){
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] +  " ");
	}
}
