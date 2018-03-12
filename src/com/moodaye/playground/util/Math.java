package com.moodaye.playground.util;

public class Math {

	public static long choose(int n, int k){
		assert 1 <= k && k <= n;
		long res = 1;
		for(int i = 1; i <= k; i++){
			res = res * (n - i + 1) / i;
		}
		return res;
	}
}
