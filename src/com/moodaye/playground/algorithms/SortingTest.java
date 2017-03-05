package com.moodaye.playground.algorithms;

import static org.junit.Assert.*;
import java.util.Comparator;
import org.junit.Test;

public class SortingTest {
	
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
		printArray(a);
	}
	
	private void printArray(int[] a){
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] +  " ");
	}
}
