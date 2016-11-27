package com.moodaye.playground.misc;

public class MarketQueue {

	public static void main(String[] args) {

		//initialize queue (List<Integer>) and tills (List<Integer - size n)
		//send first n customers to tills. Start clock
		//decrement the items in till by one.  once item(s) reach zero - move another item(s) from queue to till(s)
		//once items in queue are done (size = 0) - add time left to clear tills to time elapsed.
		
		//try recursion to do this
		
		//the returned value from function is time that elapses (one minute each call except 
		//private static int elapseTimeByOneMinute(
		
		//Base case --> if queue = 0 - then time left = time to clear tills
		//return from function with (time left)
		
		//if tills are clear (any item is zero) - then populate from queue
		//decrement value of items at tills by one
		//call function again (recurse) and return value returned by function + 1
		
		

	}

}
