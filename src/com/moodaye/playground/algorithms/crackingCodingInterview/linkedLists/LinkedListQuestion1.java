package com.moodaye.playground.algorithms.crackingCodingInterview.linkedLists;

/*
 * Removing duplicates from an unsorted linked list.
 * 
 * Solution 1:
 * 	Given head
 * 	n=head.next
 * 	current = head;
 * 	prev = head;
 * 	
 * 	while(true)
 * 		if (current.next == null)  //reached end of list
 * 			break;
 * 		else
 * 			current = current.next;
 * 	
 * 		if (current.value == n.value)
 * 			prev.next = n.next;  //delink n
 * 			n = n.next;
 * 			continue;
 * 		
 * 		prev = n;
 * 		n = n.next;
 * 
 *  
 */

public class LinkedListQuestion1 {
	
	public static void main(String args[]){
		//setup an example
		// 10 --> 20 ---> 30 ---> 20
		Node head = new Node(10);
		head.setNext(new Node(20));
		head.getNext().setNext(new Node(30));
		head.getNext().getNext().setNext(new Node(20));
		System.out.println(head.toString());
		
		removeDuplicates(head);
		System.out.println(head.toString());
	}
		
	/**
	 * Given head node - removes duplicates from linked list
	 * O(n^2)
	 * @param head
	 */
	public static void removeDuplicates(Node head){
		
		//Pseudo code for solution without buffer
		// current = head  //current is our iterator
		// while current.next != null
		// 		runner = current //runner checks nodes subsequent to current
		//		while (runner.next != null)
		// 			if current.value = runner.next.value - set runner.next = runner.next.next (delink runner.next)
		// 			else runner = runner.next
		
		//First cut implementation - way to long and cluttered. 
	/*	Node n = head.getNext();
		Node current = head;
		Node previous = head;
		
		while(true){
	
			//iterated through all elements
			if(current.getNext() == null){
				break;
			}
		
			//reached end of list for this iteration
			if(null == n.getNext()){
				if (current.getValue() == n.getValue()){
					previous.setNext(null);
				}
				current = current.getNext();
				previous = current;
				n = current.getNext();
				continue;
			}
		
			// found duplicate - therefore delink n
			if(current.getValue() == n.getValue()){
				previous.setNext(n.getNext());
				n = n.getNext();
				continue;
			}
			
			previous = n;
			n = n.getNext();
		}
	
	}*/
	}
}	
		
		
		


class Node{
	private int value = 0;
	private Node next = null;
	
	public Node(int value){
		this.value = value;
	}
	
	public void setNext(Node node){
		this.next = node;
	}
	
	public Node getNext(){
		return next;
	}
	
	public int getValue(){
		return value;
	}
	
	public void appendToTail(int value){
		Node newTail = new Node(value);
		if (this.next == null){
			this.next = newTail;
			return;
		}
		else{
			Node next = this.next;
			while(next.next != null){
				next = next.next;
				continue;
			}
			next.next = newTail;
		}
	}
	
	public String toString(){
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(value);
		Node temp = this;
		while(temp.getNext() != null){
			temp = temp.getNext();
			sb.append("---->" + temp.getValue());
		}
		
		return sb.toString();
	}
}
