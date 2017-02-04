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
		/*for (int i = 3; i < 50; i++) {
			System.out.print(computeFibonacciNumber(i) + ", ");
		}*/
		
		for (int i = 0; i<10; i++ ){
			System.out.println("fibo("+i+")= "+getNthfibo(i));
			System.out.println("fibo("+i+")= "+getNthFibo(i));
		}
	}


	/**
	 * 1,1,2,3,5,8,13,21,34,55
	 * @param length
	 * @return
	 */
	public static long[] computeFibonacciArray(int length){
		
		long[] fib = new long[length];
		fib[0] = 1;
		if (length == 1) return fib;
		fib[1] = 1;
		if (length == 2) return fib;
		
		for (int i=2; i<length; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		return  fib;
	}
	
	public static long computeFibonacciNumber(int n){
		long x = 0, y=1, aux=0;
	
		for (int i=0; i<n; i++){
			x=y;
			y=aux;
			aux = x+y;
		}
		return aux;
	}

	/**
	 * Copied code from 
	 * http://codereview.stackexchange.com/questions/51864/calculate-fibonacci-in-olog-n
	 * 
	 * @param n
	 * @return
	 */
	public static int getNthFibo(int n){
		if (n<0){
			throw new IllegalArgumentException("fibo can't be negative");
		}
	
		if (n <= 1) {
			return 1;
		}
		
		int[][] result = {{1,0}, {0,1}};
		int[][] fiboM  = {{1,1}, {1,0}};
		
		while (n > 0){
			if (n%2 == 1){
				multiMatrix(result, fiboM);
			}
			n = n/2;
			multiMatrix(fiboM, fiboM);
		}
		
		return result[1][0];
	}

	private static void multiMatrix(int[][] m, int[][] n){
		int a = m[0][0] * n[0][0] + m[0][1] * n[1][0];
		int b = m[0][0] * n[0][1] + m[0][1] * n[1][1];
		int c = m[1][0] * n[0][0] + m[1][1] * n[0][1];
		int d = m[1][0] * n[0][1] + m[1][1] * n[0][1];
		
		m[0][0] = a;
		m[0][1] = b;
		m[1][0] = c;
		m[1][1] = d;
	}
	
	//TODOS
	//1. fix issue - the fibos are not correct for the linear recurrence method
	//2. write test cases (junit)
	//3. generize the multiMatrix to accept nxn matrices - currently only 2x2 supported
	//4. use long to try to expand the reach
	
	public static int getNthfibo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The fibo value cannot be negative");
        }

        if (n <= 1) return n;

        int[][] result = {{1, 0}, {0, 1}}; // identity matrix.
        int[][] fiboM = {{1, 1}, {1, 0}};

        while (n > 0) {
            if (n%2 == 1) {
                multMatrix(result, fiboM);
            }
            n = n / 2;
            multMatrix(fiboM, fiboM);
        }

        return result[1][0];
    }

    private static void multMatrix(int[][] m, int [][] n) {
        int a = m[0][0] * n[0][0] +  m[0][1] * n[1][0];
        int b = m[0][0] * n[0][1] +  m[0][1] * n[1][1];
        int c = m[1][0] * n[0][0] +  m[1][1] * n[0][1];
        int d = m[1][0] * n[0][1] +  m[1][1] * n[1][1];

        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }	
}

