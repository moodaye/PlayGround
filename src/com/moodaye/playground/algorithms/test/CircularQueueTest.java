package com.moodaye.playground.algorithms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.moodaye.playground.dataStructures.CircularQueue;

public class CircularQueueTest {

	// TODO Create a re-usable set of queues
	
	@Test
	public void testSize(){
		CircularQueue<Integer> queue = new CircularQueue<>(10);
		assertEquals(0,queue.size());
		
		queue = generateQueueOfInts(10);
		assertEquals(10,queue.size());
		
		queue.add(new Integer(9));
		queue.add(new Integer(10));
		assertEquals(10,queue.size());
		
		assertTrue(queue.isFull());
	}
	
	@Test
	public void testGet(){
		CircularQueue<Integer> queue = generateQueueOfInts(10);

		assertEquals(new Integer(0), queue.nextItem());
		assertEquals(new Integer(1), queue.nextItem());
		assertEquals(new Integer(2), queue.nextItem());
	}
	
	private CircularQueue<Integer> generateQueueOfInts(int size){
		CircularQueue<Integer> queue = new CircularQueue<>(size);
		
		for (int i=0; i<size; i++){
			queue.add(new Integer(i));
		}
		
		return queue;
	}
	
}
