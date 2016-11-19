package com.moodaye.playground.grokkingAlgorithms.recursion;

public class Sum {

	public static void main(String[] args) {
		int[] numbersToAdd = {1,2,-3,4,5,1201};
		System.out.println(sum(numbersToAdd));
	}
	
	private static int sum(int[] numbersToAdd){
		int sum = numbersToAdd[0];
		if (numbersToAdd.length == 1) {
			return sum;
		}
		int[] dest = new int[numbersToAdd.length - 1];
		
		System.arraycopy(numbersToAdd, 1, dest, 0, numbersToAdd.length - 1);
		return sum += sum(dest);
	}
}
