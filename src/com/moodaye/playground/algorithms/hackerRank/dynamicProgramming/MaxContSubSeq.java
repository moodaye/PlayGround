package com.moodaye.playground.algorithms.hackerRank.dynamicProgramming;

import java.util.Arrays;


/**
 * Taken from the site - https://people.cs.clemson.edu/~bcdean/dp_practice/
 * 
 * Given a sequence of n real numbers A(1) ... A(n), determine a contiguous 
 * subsequence A(i) ... A(j) for which the sum of elements in the 
 * subsequence is maximized.
 *
 * @author Rajiv
 * 
 *
 */
public class MaxContSubSeq {

	public static void main(String[] args) {
	
		int[] array = {100,-200,10,98};
		System.out.println("dd");
		System.out.println(maxSubSequenceValue(array));
	}
	
	/**
	 * Define boundaries for array values and length
	 * Change return to long if needed
	 * @param array
	 * @return
	 */
	public static int maxSubSequenceValue(int[] array){
		int[] mxValByIndx = new int[array.length];
		
		for (int i=0; i<array.length; i++){
			mxValByIndx[i] = maxContVal(Arrays.copyOf(array,i+1));
		}
		//return max element in mxValByIndx 
		Arrays.sort(mxValByIndx);
		return mxValByIndx[array.length-1];
	}
	
	private static int maxContVal(int[] array){
		if ((array.length) == 1) return array[0];
	
		int[] subArray = Arrays.copyOf(array, array.length-1);
		int maxSubArray = maxContVal(subArray);
		
		int last = array[array.length-1];
		
		if (last > maxSubArray + last){ 
			return last;
		}
		else{
			return maxSubArray + last;
		}
	}

}
