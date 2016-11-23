package com.moodaye.playground.grokkingAlgorithms.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BinarySearch {
	public static void main(String args[]){

		List<String> listToSearch = new ArrayList<String>();
		listToSearch.add("Rajiv");
		listToSearch.add("Kavita");
		listToSearch.add("Rasha");
		listToSearch.add("Roonie");
		listToSearch.add("Neela");
		listToSearch.add("Alisha");
		listToSearch.add("Tom");
		listToSearch.add("Mike");
		listToSearch.add("Crystal");
		listToSearch.add("Florence");
		
		Collections.sort(listToSearch);
		
		System.out.println(binarySearch(listToSearch, "Rajiv"));
		System.out.println(binarySearch(listToSearch, "Trump"));
		System.out.println(binarySearch(listToSearch, "Florence"));
		
	}
	
	private static boolean binarySearch(List<String> listToSearch, String searchString){
		if (listToSearch == null || searchString == null){
			return false;
		}

		if (listToSearch.size() == 1){
			return ((searchString.equals(listToSearch.get(0)) ? true : false));
		}
		
		List<String> newList = new ArrayList<String>();
		String midString = listToSearch.get(listToSearch.size()/2);
		
		if (midString.equals(searchString)) {
			return true;
		} else {
			if(midString.compareTo(searchString) > 0){
				
				for (int i=0; i<listToSearch.size()/2; i++){
					newList.add(listToSearch.get(i));
				}
			}
			else{
				for (int i=listToSearch.size()/2; i < listToSearch.size(); i++){
					newList.add(listToSearch.get(i));
				}
			}
		}
		return binarySearch(newList, searchString);
	}
}
