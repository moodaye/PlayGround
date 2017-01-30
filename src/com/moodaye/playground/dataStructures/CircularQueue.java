package com.moodaye.playground.dataStructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Was asked to implement this in an interview.  
 * Basically when the queue is full - new items get added to the top of the queue.
 * When this is the case - let's assume for now that the order will remain FIFO.
 * 
 * So just occured to me as I was writing this code - that a regular queue moves forward - saying you are buying 
 * tickets are a window.   Perhaps a circular queue stays in place ... then - folks occupy the empty seats at the
 * front of the queue after the queue is full.
 * 
 * OK - upon little research realized that the regular queue does not move forward if full?? 
 * 
 * NS - understand the requirements of a circular queue and how it varies from a regular queue.
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
	//TODO - confirm we can or cannot use an array here instead
	//TODO - ArrayList might not be good choice since it shifts elements to the left upon remove
	private List<T> queue = new ArrayList(10);
	private int size = 10;

	//TODO - do we need a default no args constructor?
	public CircularQueue(int size){
		this.size = size;
	}
	
	//add an item
	public void add(T item){
		
		if (queue.size() == size){
			//do nothing for now
			//TODO - return exception
		}
		else{
			queue.add(item);
		}
	}
	
	//TODO - implement offer(T) - returns false if full
	//TODO - implement poll() - returns null if empty
	//TODO - implement peek() - returns null if empty
	

	//TODO - rename to remove and throw unchecked exception if empty
	//get an item
	public T nextItem(){
		return queue.remove(0);
	}
	
	//how many items?
	public int size(){
		return queue.size();
	}
	
	public boolean isFull(){
		return (size == queue.size() ? true : false);
	}
	
}
