package com.moodaye.playground.algorithms.hackerRank.algorithms.graphs;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *You are given a tree (a simple connected graph with no cycles). 
 *The tree has N nodes numbered from 1 to N and is rooted at node 1. 
 *Find the maximum number of edges you can remove from the tree to 
 *get a forest such that each connected component of the forest 
 *contains an even number of vertices. 
 *Input Format
 *++++++++++++
 *The first line of input contains two integers N and M. N is the 
 *number of vertices, and M is the number of edges. The next M lines 
 *contain two integers ui and vi which specifies an edge of the tree.
 *
 *Constraints
 *2 <= N <= 100
 *
 *Note: The tree in the input will be such that it can always be 
 *decomposed into components containing an even number of nodes.
 *
 *Output Format
 *Print the number of removed edges. 
 *
 * @author Rajiv
 *
 */
public class EvenTree {
	//Strategy
	//If we can count all nodes with an odd number of children - that should be the answer.
	//So the Node class will contain a list of all immediate children.
	//We create a map by integer of to all nodes.
	//Some examples
	//if we have  
	// 1-->2; 1-->3; 1-->6 
	// 3-->4; 
	// 6-->8
	// 8-->9; 8-->10
	// In the above example - node(1) is ignored.  Then nodes 3 and 4 have odd children. so answer is 2.
	// Class Node --> will have link to immediate children
	
	//Is there an easier way - like total number of nodes - parent nodes?
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int nodeCount = in.nextInt();
		int edgeCount = in.nextInt();
		
		//Create Tree
		Map<Integer,Node> myTree = new HashMap<>();
		myTree.put(1,new Node(1));
		for (int i=0; i<edgeCount; i++){
			Node child = new Node(in.nextInt());
			int parent = in.nextInt();
		
			//assumes that parents won't be assigned children
			//before being assigned themselves
			myTree.put(child.getId(), child);
			myTree.get(parent).addChild(child);
		}
		
		System.out.println(getEdgeCountToMakeEvenForest(myTree));
	}
	
	public static int getEdgeCountToMakeEvenForest(Map<Integer,Node> tree){
		Collection<Integer> keys = tree.keySet();
		int count = 0;
		for (int i: keys){
			if (i==1) continue;
			
			if (tree.get(i).getChildren().size() % 2 == 1){
				count++;
			}
		}
	
		return count;
	}
}

class Node{
	List<Node> children = new LinkedList<>();
	Integer id;
	
	Node(Integer id){
		this.id = id;
	}
	
	Integer getId(){
		return id;
	}
	
	void addChild(Node child){
		children.add(child);
	}
	
	List<Node> getChildren(){
		return children;
	}
}
