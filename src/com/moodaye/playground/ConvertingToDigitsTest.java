package com.moodaye.playground;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertingToDigitsTest {

	@Test
	public void testStringToDigits() {
		
		int[] a1 = ConvertingToDigits.stringToDigits("1234");
		int[] e1 = {1,2,3,4};
		assertArrayEquals(e1, a1);
	}
	
	@Test 
	public void testIntegerToString(){
		int[] a1 = ConvertingToDigits.integerToDigits(1234);
		int[] e1 = {1,2,3,4};
		assertArrayEquals(e1, a1);
	}
}
