package com.moodaye.playground.algorithms.hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * HackerRank problem - and based on problem 62 from projectEuler.net
 * 
 * @author Rajiv
 *
 */
public class CubicPermutations {

	public static void main(String[] args) {
		
		//read from std in
		Scanner scanner = new Scanner(System.in);
		long boundary  = scanner.nextLong();
		int size = scanner.nextInt();
		
		printAllCubesLessThan(boundary,size);
	}
	
	
	/**
	 * @param boundary
	 */
	/**
	 * @param boundary
	 * @param size
	 */
	/**
	 * @param boundary
	 * @param size
	 */
	static void printAllCubesLessThan(long boundary, int size){

		if (boundary <= 0) throw new RuntimeException("illegal boundary");
		long cubeRoot = 0;
		
		Map<String,List<Long>> map = new HashMap<>();
		
		while(true){
		
			List<Long> list = new LinkedList<Long>();
			long cube = cubeRoot * cubeRoot * cubeRoot;
		
			//sort the cube - convert to String for ease
			String strCube = String.valueOf(cube);
			char[] charCube = strCube.toCharArray();
			Arrays.sort(charCube);
			strCube = String.valueOf(charCube);
		
			// check for permutations - and if so - 
			// add the cubeRoot to the list of values
			if (map.containsKey(strCube)){
				list = map.get(strCube);
				list.add(new Long(cubeRoot));
				map.put(strCube, list);
			}
			else{
				list.add(new Long(cubeRoot));
				map.put(strCube,list);
			}
			
			if (cubeRoot > boundary - 1) break;
			cubeRoot++;
		}
	
		Set<Long> results = new TreeSet<Long>();
		
		Iterator<Entry<String, List<Long>>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, List<Long>> pair = it.next();
			if (pair.getValue().size() == size){
				System.out.println(pair.getKey() + "======" + pair.getValue());
				results.add(pair.getValue().get(0));
			}
		}
	
		Iterator<Long> iter = results.iterator();
		while(iter.hasNext()){
			long num = iter.next();
			System.out.println(num*num*num + "  ");
		}
	}
}
