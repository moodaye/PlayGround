package com.moodaye.playground.algorithms.hackerRank.dynamicProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxContSubSeqTest {

	@Test
	public void test() {
	
		assertEquals(6, MaxContSubSeq.
				maxSubSequenceValue(new int[] {1,2,3}));
		
		assertEquals(1, MaxContSubSeq.
				maxSubSequenceValue(new int[] {1}));
		
		assertEquals(-1, MaxContSubSeq.
				maxSubSequenceValue(new int[] {-1}));
		
		assertEquals(7973, MaxContSubSeq.
				maxSubSequenceValue(new int[] {10,-1200,3000, -30, 5003, -20000}));
	
		//started 810am; 1391.2 MB Ram; 38% CPU
		int[] array = new int[100000];
		for (int i=0; i<array.length; i++){
			array[i] = 10000;
		}
		assertEquals(100000*10000, MaxContSubSeq.
				maxSubSequenceValue(array));
		
	}

}
