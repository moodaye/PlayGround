package com.moodaye.playground.algorithms;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Graph {
	
	Set<Integer>[] adj;
	
	/**
	 * Constructs an empty graph with no edges 
	 * and v vertices 
	 * @param v
	 */
	public Graph(int v){
		adj = new HashSet[v];
		for(int i=0; i<v; i++){
			adj[i] = new HashSet<Integer>();
		}
	}

	/**
	 * Constructs a graph from an input stream
	 * @param in
	 */
	public Graph(InputStream in){
	}
	
	public  void addEdge(int u, int v){
		
	}

	/**
	 * returns vertices adjacent to v
	 * @param v vertex
	 * @return
	 */
	public Iterable<Integer> adj(int v){
		return null;
	}
	
	public int numberOfVertices(){
		return adj.length;
	}
	
	public int numberOfEdges(){
		return 0;
	}
	
	public String toString(){
		return null;
	}

	/**
	 * Compute the degree of v
	 * @param g
	 * @param v
	 * @return
	 */
	public static int degree(Graph g, int v){
		int degree = 0;
		for (int w: g.adj(v)) degree++;
		return degree;
	}
	
	public static int maxDegree(Graph g){
		int maxDegree = 0;
		for(int i=0; i<g.numberOfVertices(); i++){
			if (degree(g, i)>maxDegree){
				maxDegree = degree(g, i);
			}
		}
		return maxDegree;
	}
	
	public static double averageDegree(Graph g){
		return 2.0 * g.numberOfEdges() / g.numberOfVertices();
	}
	
	public static int numberOfSelfLoops(Graph g){
		int numberOfSelfLoops = 0;
		for (int i=0; i<g.numberOfVertices(); i++){
			for (int w:g.adj(i)){
				if (w == i) numberOfSelfLoops++;
			}
		}
		return numberOfSelfLoops/2;
	}

}
