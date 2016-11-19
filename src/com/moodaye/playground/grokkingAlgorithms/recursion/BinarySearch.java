package com.moodaye.playground.grokkingAlgorithms.recursion;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BinarySearch {
	public static void main(String args[]){

		Set<String> listToSearch = new TreeSet();
		listToSearch.add("Rajiv");
		listToSearch.add("Kavita");
		listToSearch.add("Rasha");
		listToSearch.add("Roonie");
		
		System.out.println(binarySearch(listToSearch, "Rajiv"));
	}
	
	private static boolean binarySearch(Set<String> listToSearch, String searchString){
		if (listToSearch == null || searchString == null){
			return false;
		}
		if (listToSearch.size() == 1){
			return ((searchString.equals(listToSearch.get(0)) ? true : false));
		}
		
		List<String> newList = null;
		String midString = listToSearch.get(listToSearch.size()/2);
		
		if (midString.equals(searchString)) {
			return true;
		} else {
			if(midString.compareTo(searchString) < 0){
				newList = listToSearch.subList(0, listToSearch.size()/2);
			}
			else{
				newList = listToSearch.subList(listToSearch.size()/2, listToSearch.size()-1);
			}
		}
		return binarySearch(newList, searchString);
	}

}
