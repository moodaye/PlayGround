package com.moodaye.playground.algorithms.hackerRank.projectEuler;



public class SumOfSquaresIsASquarePE171 {
	
	public static void main(String args[]){
//		calcSum(100);
		calcSum(10000000000000L);
	}

	public static void calcSum(long a){
		long answer = 0;
		for (long n=1; n<=a; n++){
			String strA = String.valueOf(n);
			char[] chaA = strA.toCharArray();
			long sum = 0;
			for (int i = 0; i < chaA.length; i++) {
				int num = Integer.parseInt(String.valueOf(chaA[i]));
				sum += num * num;
			}
			double sqrt = Math.sqrt(sum);
			long x = (int) sqrt;
			if (x == sqrt){
				answer += n;
			}
		}
		System.out.println(answer);
	}
}
