package com.moodaye.playground.dataStructures;

import java.util.Iterator;

/**
 * Strategy:  Use an array - with a pointer for head of queue
 * and pointer for tail.  The tail loops around when the queue is
 * full and items are dequeued.  
 * 
 * At start head is -1 - indicating queue is empty as is tail.
 * After first item -head is 0 - indicating that item will be 
 * dequeued next.  The tail is at 1 indicating that this is where
 * the next item will be inserted.
 * 
 * With each item inserted - the tail keeps moving up by one.  
 * 
 * With each item dequed - the head keeps moving up one. 
 * 
 * Start:    t _ _ _ _ _    (head = -1; tail = 0); (size = 0) 
 * Enqueue:  h t _ _ _ _    (head = 0; tail = 1);  (size = 1) 
 * Enqueue:  h x t _ _ _    (head = 0; tail = 2);  (size = 2) 
 * Dequeue:  _ h t _ _ _    (head = 1; tail = 2);  (size = 1) 
 * Dequeue:  t _ _ _ _ _    (head = -1; tail = 0); (size = 0) 
 * Enqueue:  h t _ _ _ _    (head = 0; tail = 1);  (size = 1) 
 * Enqueue:  h x t _ _ _    (head = 0; tail = 2);  (size = 2) 
 * Enqueue:  h x x t _ _    (head = 0; tail = 3);  (size = 3) 
 * Enqueue:  h x x x t _    (head = 0; tail = 4);  (size = 4) 
 * Enqueue:  h x x x x t    (head = 0; tail = 5);  (size = 5) 
 * Enqueue:  h x x x x x    (head = 0; tail = 6);  (size = 6) 
 * Enqueue:  h x x x x x    (head = 0; tail = 6);  (size = 6) (throw exception)
 * Dequeue:  t h x x x x    (head = 1; tail = 0);  (size = 5) 
 * Dequeue:  t _ h x x x    (head = 2; tail = 0);  (size = 4) 
 * Dequeue:  t _ _ h x x    (head = 3; tail = 0);  (size = 3) 
 * Enqueue:  x t _ h x x    (head = 3; tail = 1);  (size = 4) 
 * Dequeue:  x t _ _ x x    (head = 4; tail = 1);  (size = 3) 
 * Dequeue:  x t _ _ _ x    (head = 5; tail = 1);  (size = 2) 
 * Dequeue:  x t _ _ _ _    (head = 0; tail = 1);  (size = 1) 
 * Dequeue:  t _ _ _ _ _    (head = -1; tail = 0); (size = 1) 
 * 
 * Tail always indicates where the next item will be added.
 * If queue is full - then tail = size or tail is at
 * Therefore 0 <= tail <= maxSize;
 * 
 * Head always indicates the next item that will be dequeued.
 * If queue is empty - head = -1. 
 * Therefore -1 <= head <= maxSize - 1
 *
 * TODO - Iterator
 * 
 * @author Rajiv
 *
 */
public class CircularQueueWithArray implements Iterable{

	/**
	 * Max size of queue
	 */
	int maxSize = 10;

	/**
	 * Current size of queue
	 */
	int size = 0;

	/**
	 * Current head of queue.
	 */
	int head = 0;
	
	String[] queue = null;
	
	/**
	 * Current tail of queue.  This is where
	 * items will be added. Tail will begin at 
	 * index 0; move progressively towards the 
	 * end and then wrap around 
	 */
	int tail = 0;
	

	/**
	 * Creates an empty queue with size 10
	 */
	public CircularQueueWithArray(){
		queue = new String[maxSize];
		
	}
	
	public CircularQueueWithArray(int maxSize){
		this.maxSize = maxSize;
		queue = new String[maxSize];
	}

	//TODO  - create custom Exception class
	public void enQueue(String str) throws Exception{
		if (size == maxSize) throw new Exception("queue is full");
		if (tail == maxSize - 1){
			queue[tail] = str;
			tail = 0;
		}
		else{
			queue[tail++] = str;
		}
		size++;
	}
	
	public String deQueue() throws Exception{
		if (size == 0) throw new Exception("queue is empty");
		size--;
		if (head == maxSize - 1){
			head = 0;
			return queue[maxSize-1];
		}
		return queue[head++];
	}
	
	public int size(){
		return size;
	}
	
	public String pop() throws Exception{
		return deQueue();
	}
	
	public void push(String str) throws Exception{
		enQueue(str);
	}

	//TODO - implement
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

