package com.moodaye.playground.util;

import static org.junit.Assert.*;

import org.junit.Test;
import static com.moodaye.playground.util.Math.*;
public class MathTest {

	@Test
	public void testChoose() {
		assertEquals(2, choose(2, 1));
		assertEquals(1, choose(2, 2));
		assertEquals(32 * 31 / 2, choose(32, 2));
	}
}
