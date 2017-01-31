package com.moodaye.playground.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {
	@Test
	public void testGcd() {
		assertEquals(2, Math.gcd(2, 4));
		assertEquals(10, Math.gcd(400, 490));
		assertEquals(10, Math.gcd(400,-490));
	}
}
