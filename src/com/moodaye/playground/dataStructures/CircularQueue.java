package com.moodaye.playground.dataStructures;

import java.util.ArrayList;
import java.util.List;

/**
 * A circular queue is a regular queue implemented with an array that circles around.
 * 
 * Test Conditions:
 * 		Zero Queue - should return null;
 *		Queue size 10 - add 4 items - test for FIFO
 *		Queue size 10 - add 10 items - test for FIFO1
 *		Queue size 10 - add 11 items - 11th item should return message that queue is full
 *		Queue size 10 - add 10 items - remove 1 item; add 1 item - check for FIFO
 *		Queue size 10 - add 10 items - remove 2 items; add 1 item - check for FIFO
 *		Queue size 10 - add 10 items - remove 2 items; add 2 item - check for FIFO
 *		Queue size 10 - add 10 items - remove 2 items; add 3 item - check for message that queue is fullFIFO
 *		Queue size 10 - add 10 items - remove 10 items; add 2 items - check for FIFO
 * @author Rajiv
 *
 */
public class CircularQueue<T> {
	
	ArrayList<T> ar = new ArrayList<>();
	
	T[] queue; 
	//TODO - confirm we can or cannot use an array here instead
	//TODO - ArrayList might not be good choice since it shifts elements to the left upon remove
	private int size = 10;

	//TODO - do we need a default no args constructor?
	public CircularQueue(int size){
		//queue = new T[size];
		this.size = size;
	}
	
	//add an item
	public void add(T item){
		
		if (queue.length == size){
			//do nothing for now
			//TODO - return exception
		}
		else{
			//queue.add(item);
		}
	}
	
	//TODO - implement offer(T) - returns false if full
	//TODO - implement poll() - returns null if empty
	//TODO - implement peek() - returns null if empty
	

	//TODO - rename to remove and throw unchecked exception if empty
	//get an item
	public T nextItem(){
		return null;
		//return queue.remove(0);
	}
	
	//how many items?
	public int size(){
		return queue.length;
	}
	
	public boolean isFull(){
		return (size == queue.length ? true : false);
	}
	
}
