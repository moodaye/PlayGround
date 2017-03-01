package com.moodaye.playground.dataStructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		Stack<Integer> stack1 = new Stack<>();
		
		stack1.push(new Integer(1));
		stack1.push(new Integer(2));
		stack1.push(new Integer(3));
		
		assertEquals(new Integer(3), stack1.pop());
		assertEquals(new Integer(2), stack1.pop());
		assertEquals(new Integer(1), stack1.pop());
	}

}
