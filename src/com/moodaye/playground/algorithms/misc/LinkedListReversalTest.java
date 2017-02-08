package com.moodaye.playground.algorithms.misc;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListReversalTest {

	@Test
	public void testToString() {
		Node head = new Node(0);
		assertEquals("0", head.toString());
		
		head.setNext(new Node(1));
		assertEquals("0--->1", head.toString());
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		node3.setNext(node4);
		node2.setNext(node3);
		node1.setNext(node2);
		head.setNext(node1);
		assertEquals("0--->1--->2--->3--->4", head.toString());
	}

}
