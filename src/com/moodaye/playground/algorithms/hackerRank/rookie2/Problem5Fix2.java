package com.moodaye.playground.algorithms.hackerRank.rookie2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

//Prefix Neighbors
//Attempt to fix the issue with Problem5
//But too slow - timeout on HackerRank
public class Problem5Fix2 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		List<String> dic = new ArrayList<>(size);
		for (int i=0; i<size; i++){
			dic.add(in.next());
		}
		if (size == 1){
			System.out.println(getBenefitValue(dic.get(0)));
			System.exit(0);
		}
		
		Collections.sort(dic);
		
		SortedSet<String> noPf = new TreeSet<>();
		SortedSet<String> rejects = new TreeSet<>();
	
		SortedMap<String,HashSet<String>> solutionPfs = new TreeMap<>();
		SortedMap<String,HashSet<String>> rejectPfs = new TreeMap<>();
		
		noPf.add(dic.get(size-1));
		addToListByPrefix(dic.get(size-1), solutionPfs); 
		
		for (int i=size-2; i>=0; i--){
			if( isPrefix(dic.get(i), dic.get(i+1))){
				if (i==0)continue;
				//then skip the ith element... and start over
				//with i-1.  That is, add i-1 and loop over
				rejects.add(dic.get(i));
				addToListByPrefix(dic.get(i), rejectPfs); 
				i=i-1;
//				if(!isPrefixNeighbor(dic.get(i), noPf, rejects)){
				if(!isPrefixNeighbor(dic.get(i), solutionPfs, rejectPfs)){
					noPf.add(dic.get(i));
					addToListByPrefix(dic.get(i), solutionPfs); 
				}
			}
			else{
//				if(!isPrefixNeighbor(dic.get(i), noPf, rejects)){
				if(!isPrefixNeighbor(dic.get(i), solutionPfs, rejectPfs)){
					noPf.add(dic.get(i));
					addToListByPrefix(dic.get(i), solutionPfs); 
				}
			}
		}
	
		long maxBv = 0;
		for( String s: noPf){
			maxBv += getBenefitValue(s);
		}
		System.out.println(maxBv);
		System.out.println(noPf);
		System.out.println(rejects);
	}
	
	public static boolean isPrefix(String s1, String s2){
		if (s1.length() < s2.length()){
			return (s2.indexOf(s1) == 0) ? true : false;
		}
		return (s1.indexOf(s2) == 0) ? true : false;
	}
	
	public static int getBenefitValue(String string){
		char[] chStr = string.toCharArray();
		int bfv = 0;
	for(char c: chStr){
			bfv += c;
		}
		return bfv;
	}
	
	/**
	 * Check whether s1 is the prefixNeighbor of any element in 
	 * solution.  Do this by looking for elements in solution that
	 * have s1 as a prefix.  If none - then return true.
	 * Else, look in the rejects for any element which also prefixes
	 * the same element in solution.  If you find such a string in 
	 * rejects, and it has length greater than s1 and then return
	 * true.  Else return false.
	 * 
	 * @param s1
	 * @param solution
	 * @param rejects
	 * @return
	 */
	private static boolean isPrefixNeighbor(String s, SortedSet<String> solution, SortedSet<String> rejects){
		for (String sol: solution){
			boolean foundMatch = false;
			if( sol.indexOf(s) == 0){
				for (String rej: rejects){
					if ((sol.indexOf(rej) == 0 && rej.indexOf(s) == 0)){
						foundMatch = true;
						break;
					}
				}
				if (!foundMatch) return true;
			}
		}
		return false;
	}

	/**
	 * Attempt to speed up
	 * @param s
	 * @param prefixToWords
	 * @return
	 */
	private static boolean isPrefixNeighbor(String s, SortedMap<String, HashSet<String>> solutionMap, SortedMap<String,HashSet<String>> rejectsMap){
		Set<String> solPf = solutionMap.get(s);
		Set<String> rejPf = rejectsMap.get(s);
		if (solPf == null || rejPf == null) return false;
		
		for(String sol: solPf){
			boolean foundMatch = false;
			for(String reject: rejPf ){
				if(solutionMap.get(reject) != null && solutionMap.get(reject).contains(sol)){
					foundMatch = true;
					break;
				}
			}
			if(!foundMatch) return true;
		}
		return false;
	}

	//for each prefix of the given word - add it to the collection.
	private static void addToListByPrefix(String s, SortedMap<String,HashSet<String>> prefixToWords){
		for(int i=0; i<s.length()-1; i++){
			String prefix = s.substring(0,i+1);
			HashSet<String> hs = prefixToWords.get(s);
			if (hs == null){
				hs = new HashSet<>();
			}
			hs.add(s);
			prefixToWords.put(prefix, hs);
		}
	}
	
	
}
