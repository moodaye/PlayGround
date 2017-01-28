package com.moodaye.playground.algorithms.grokkingAlgorithms.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRecursion {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(new String("Rajiv"));
		list.add(new String("Kavita"));
		list.add(new String("Ronnie"));
		list.add(new String("Tasha"));
		list.add(new String("Alisha"));
		System.out.println(printList(list));
		System.out.println("size = " + list.size());
	}
	
	//TODO: How to make it a parameterized list - any point in doing so?
	private static String printList(List list){
		//base case
		if (list.isEmpty()){
			return null;
		}
		else if (list.size() == 1){
			return list.get(0).toString();
		}
		Object item = list.get(0);
		List slist = list.subList(1, list.size()-1);
		return item.toString() + printList(slist);
			
	}

}
