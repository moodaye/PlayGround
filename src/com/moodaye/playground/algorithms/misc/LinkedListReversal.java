package com.moodaye.playground.algorithms.misc;

import java.util.Deque;
import java.util.Stack;

/**
 * Problem on some website - 
 * how to reverse linked list using
 * regression
 * @author Rajiv
 *
 */
public class LinkedListReversal {

	//create a linked list
	//print it out
	//call reversal function to 
	//reverse it.  Verify
	public static void main(String args[]){
		Node head = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		node3.setNext(node4);
		node2.setNext(node3);
		node1.setNext(node2);
		head.setNext(node1);
		
		System.out.println(head.toString());
		Node reversedHead = reverseLLIterative(head);
		System.out.println(reversedHead.toString());
		
	}
	
	
	private static Node reverseLLIterative(Node node){
		
		if (node == null || node.next == null){
			return node;
		}
		
		//head(0) --> 1 --> 2 --> 3 --> tail
		// given head; 
		// brokenNode = head.next.next; head.next = head; head = head.next
		// 0 <-- 1(head)     2 (brookenNode) --> 3 --> tail
		
		// tempNode = brokenNode.next (3) ; brokenNode.next = head (1) ; head = brokenNode (2); brokenNode(3) = tempNode
		//head <-- 1 <-- 2 (head)   3 (brokenNode) --> tail

		// tempNode = brokenNode.next (tail) ; brokenNode.next = head (2) ; head = brokenNode (2); brokenNode(3) = tempNode
		//head <-- 1 <-- 2 (head)   3 --> tail

		Node head = node;
		Node brokenNode = head.next.next;
		head.next.next = head;
		head = head.next;
		System.out.println(head.toString());
		
		while(head.next != null){
			Node tempNode = brokenNode.next;
			brokenNode.next = head;
			head = brokenNode;
			brokenNode = tempNode;
		}
		
		return head;
	}

	/**
	 * returns the new head
	 * How do we return the new head?
	 * @param node
	 * @return
	 */
	private static Node reverseLLRecursive(Node node){
		Node reversedHead = null;
		
		//This is a single node list - so return
		if (node.getNext() == null){
		//	node.setNext(node);
			return node;
		}
	
		//start reversal from penultimate node
		//and first set the head
		if (node.getNext().getNext() == null){
			reversedHead = node.getNext();
			node.getNext().setNext(node);
			return node;
		}
	
		//reverseLL(node.getNext()).setNext(node);
		return reversedHead;
	}

}


class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value = value;
	}
	
	void setNext(Node next){
		this.next = next;
	}
	
	Node getNext(){
		return next;
	}
	
	int getValue(){
		return value;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(this.value);
		
		Node pointer = this.next;
		
		while(pointer != null){
			sb.append("--->" + pointer.getValue());
			pointer = pointer.getNext();
		}
		return sb.toString();
	}
}


