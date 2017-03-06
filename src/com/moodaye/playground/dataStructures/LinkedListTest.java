package com.moodaye.playground.dataStructures;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test1() {
		LinkedList<String> ll = new LinkedList<>();
		assertEquals(1, ll.size());
		
		ll.add("Second");
		ll.add("Third");
		ll.add("Fourth");
		ll.add("Fifth");
		assertEquals(5, ll.size());
		
	}
	
	@Test
	public void testIterator(){
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Second");
		ll.add("Third");
		ll.add("Fourth");
		ll.add("Fifth");
		
		Iterator it = ll.iterator();
		assertEquals("First", it.next());
		assertEquals("Second", it.next());
		assertEquals("Third", it.next());
		assertEquals("Fourth", it.next());
		assertEquals("Fifth", it.next());
	}
	
//	expected NoSuchElementException.class)
//	@Test (expected : NoSuchElementException)
	public void testIterator2(){
		LinkedList<String> ll = new LinkedList<>();
		Iterator it = ll.iterator();
		it.next();
		it.next();
		
	}

}
