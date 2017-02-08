package com.moodaye.playground.algorithms.crackingCodingInterview.linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListQuestion1Test {

	@Test
	public void testNode() {
		Node head = new Node(10);
		head.appendToTail(20);
		head.appendToTail(30);
		head.appendToTail(40);
		head.appendToTail(50);
		
		assertEquals(10, head.getValue());
		assertEquals(20, head.getNext().getValue());
		assertEquals(30, head.getNext().getNext().getValue());
		assertEquals(40, head.getNext().getNext().getNext().getValue());
		assertEquals(50, head.getNext().getNext().getNext().getNext().getValue());

		//replace node 3 (value = 30)
		Node newNode3 = new Node(301);
	
		Node node2 = head.getNext();
		Node node4 = head.getNext().getNext().getNext();
		newNode3.setNext(node4);
		node2.setNext(newNode3);
		
		assertEquals(10, head.getValue());
		assertEquals(20, head.getNext().getValue());
		assertEquals(301, head.getNext().getNext().getValue());
		assertEquals(40, head.getNext().getNext().getNext().getValue());
		assertEquals(50, head.getNext().getNext().getNext().getNext().getValue());
		
	}

}
