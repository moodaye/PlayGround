package com.moodaye.playground.dataStructures;

public class Stack<T> {
	Node head;
	
	public<T> Stack(){
	
	}
	
	public void push(T t){
		Node<T> node = new Node(t, head);
		this.head = node;
	}
	
	public T pop(){
		Node<T> node = head;
		head = node.next;
		return node.t;
	}
	
	private class Node<T>{
		T t;
		Node next;
		
		Node(T t, Node next){
			this.t = t;
			this.next = next;
		}
	}
}
