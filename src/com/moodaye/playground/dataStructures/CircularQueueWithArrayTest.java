package com.moodaye.playground.dataStructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularQueueWithArrayTest {

	@Test
	public void testSimple1() throws Exception{
		CircularQueueWithArray queue = new CircularQueueWithArray();
		queue.push("First");
		queue.push("Second");
		queue.push("Third");
		assertEquals(3, queue.size());
		assertEquals("First", queue.pop());
		assertEquals("Second", queue.pop());
		assertEquals("Third", queue.pop());
		assertEquals(0, queue.size());
	}
	
	
	@Test (expected = Exception.class)
	public void testSimple2() throws Exception{
		CircularQueueWithArray queue = new CircularQueueWithArray();
		queue.push("First"); queue.push("Second"); queue.push("Third");
		queue.push("Fourth"); queue.push("Fifth"); queue.push("Sixth");
		queue.push("Seventh"); queue.push("Eighth"); queue.push("Ninth");
		queue.push("Tenth");
		queue.push("Eleventh");
	}
	
	@Test 
	public void testWrapping1() throws Exception{
		CircularQueueWithArray queue = new CircularQueueWithArray();
		queue.push("First"); queue.push("Second"); queue.push("Third");
		queue.push("Fourth"); queue.push("Fifth"); queue.push("Sixth");
		queue.push("Seventh"); queue.push("Eighth"); queue.push("Ninth");
		queue.push("Tenth");
		assertEquals("First", queue.pop());
		assertEquals("Second", queue.pop());
		assertEquals("Third", queue.pop());
		queue.push("Eleventh"); queue.push("Twelth"); queue.push("Thirteenth");
		assertEquals("Fourth", queue.pop());
		assertEquals("Fifth", queue.pop());
		assertEquals("Sixth", queue.pop());
		assertEquals("Seventh", queue.pop());
		assertEquals("Eighth", queue.pop());
		assertEquals("Ninth", queue.pop());
		assertEquals("Tenth", queue.pop());
		assertEquals("Eleventh", queue.pop());
		assertEquals("Twelth", queue.pop());
		assertEquals("Thirteenth", queue.pop());
	
	}
}
