package com.moodaye.playground.hackerrank.datastructures;

/**
 * HackerRank - Practice - Data Structures - Stacks - Maximum Element
 * Runing count of time spent ... 3/9/17 = 20min.  Stuck on how to implement max.
 * 
 * Max = 20pts; Diff = E
 * 1    -Push the element x into the stack.
 * 2    -Delete the element present at the top of the stack.
 * 3    -Print the maximum element in the stack.
 * 1<=N<=10^5   N = Number of queries
 * 1<=x<=10^9   x = element of the stack
 * 1<=type<=3   query type
 * 
 * Strategy: Implement simple stack - Node class with link to next element. Client
 * will be presented the head Node of the stack. If head is deleted or new element is
 * pushed - the head reference is adjusted accordingly.
 * 
 * To evaluate the max - a running max element is established in the Node as an attribute.  
 * 
 * **** But - if the head node comprises the max value - we have an issue. We then need to search the stack for the 
 * max value.  So this strategy won't work.
 * 
 */
public class StacksMaximumElement {

	public static void main(String[] args) {

	}
	
	private class Stack{
		Node head;
		int maxValue = Integer.MIN_VALUE;
		
		void push(int x){
			Node newHead = new Node(x);
			newHead.next = head;
			head = newHead;
		}
		
		void delete(){
			head = head.next;
		}
	}
	
	private class Node{
		int value;  // max value is 10^9  (ok - Integer.MAX_VALUE is about 2*10^9
		Node next;
		
		Node(int value){
			this.value = value;
		}
		
	}
}

