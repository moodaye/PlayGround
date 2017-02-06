package com.moodaye.playground.algorithms.hackerRank.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Taken from the site - https://people.cs.clemson.edu/~bcdean/dp_practice/
 * 
 * Given a sequence of n real numbers A(1) ... A(n), determine a contiguous 
 * subsequence A(i) ... A(j) for which the sum of elements in the 
 * subsequence is maximized.
 *
 * @author Rajiv
 * 
 *s
 */
public class MaxContSubSeq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numberTests = in.nextInt();
		
		for (int i=0; i<numberTests; i++){
			int size = in.nextInt();
			int[] inputArray = new int[size];
			for (int j=0; j<size; j++){
				inputArray[j] = in.nextInt();
			}
//			System.out.print(maxSubSequenceValue(inputArray) + " ");
			System.out.print(maxContValNoRecursion(inputArray) + " ");
			int max = 0;
			Arrays.sort(inputArray);
			for (int k: inputArray){
				if (k > 0){
					max += k;
				}
			}
			if (max == 0){
				max = inputArray[inputArray.length - 1];
			}
			System.out.print(max);
		}
	}
	
	/**
	 * Define boundaries for array values and length
	 * Change return to long if needed
	 * @param array
	 * @return
	 */
	public static int maxSubSequenceValue(int[] array){
		//we don't need this - can simply track latest max.
		int[] mxValByIndx = new int[array.length];
		
		
		
		for (int i=0; i<array.length; i++){
//			mxValByIndx[i] = maxContVal(Arrays.copyOf(array,i+1));
			mxValByIndx[i] = maxContValNoRecursion(Arrays.copyOf(array,i+1));
		}
		//return max element in mxValByIndx 
		Arrays.sort(mxValByIndx);
		return mxValByIndx[array.length-1];
	}
	
	public static int maxContValNoRecursion(int[] array){
		if ((array.length) == 1) return array[0];
		
		int tempMax = array[0];
		int maxSoFar = array[0];
		for (int i=1; i<array.length; i++){
			tempMax  = (array[i] < tempMax + array[i])  ? tempMax + array[i] : array[i];
			maxSoFar = maxSoFar > tempMax ? maxSoFar : tempMax;
		}
		return (maxSoFar > tempMax ? maxSoFar : tempMax);
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
