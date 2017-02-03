package com.moodaye.playground.dataStructures.hackerRank;

/**
 * Shashank loves trees and math. He has a rooted tree, T , 
 * consisting of N nodes uniquely labeled with integers in the inclusive range [1,N]. 
 * The node labeled as 1 is the root node of tree , and each node in T is 
 * associated with some positive integer value (all values are initially 0).
 *
 *Let's define Fk as the kth Fibonacci number. Shashank wants to perform  types of operations 
 *over his tree, T:
 *1. U X k
 *Update the subtree rooted at node  such that the node at level  in subtree  (i.e., node ) 
 *will have added to it, all the nodes at level  will have  added to them, and so on. 
 *More formally, all the nodes at a distance  from node  in the subtree of node  will
 * have the  Fibonacci number added to them.
 * 
 * 2. Q X Y
 *Find the sum of all values associated with the nodes on the unique path from  to . 
 *Print your sum modulo  on a new line.
 *Given the configuration for tree  and a list of  operations, perform all the operations 
 *efficiently.
 *
 *Note: .
 *
 *Input Format
 *
 *The first line contains  space-separated integers,  (the number of nodes in tree ) and  .\
 *(the number of operations to be processed), respectively. 
 *Each line  of the  subsequent lines contains an integer, , denoting the parent of the  node. 
 *Each of the  subsequent lines contains one of the two types of operations mentioned in 
 *the Problem Statement above.
 *
 *Constraints
 *
 *Output Format
 *
 *For each operation of type  (i.e., ), print the required answer modulo  on a new line.
 *public class FibonacciNumbersTree {
 */
public class FibonacciNumbersTree {
	

	
	public static void main(String args[]){
		for (int i = 3; i < 50; i++) {
			System.out.print(computeFibonacci(i) + ", ");
		}
	}


	/**
	 * 1,1,2,3,5,8,13,21,34,55
	 * @param length
	 * @return
	 */
	public static long computeFibonacci(int length){
		if (length == 1) return 1;
		if (length == 2) return 1;
		
		long[] fib = new long[length];
		fib[0] = 1;
		fib[1] = 1;
		
		for (int i=2; i<length; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		return  fib[length-1];
	}

}
