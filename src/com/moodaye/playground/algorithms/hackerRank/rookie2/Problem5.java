package com.moodaye.playground.algorithms.hackerRank.rookie2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Prefix Neighbors
// Note - this solution does not work
// because the method - arePrefixNeigbor makes its determination
// solely based on the 2 strings being considered.  But - for example
// AB and ABCD could or could not be prefix neighbors - e.g., 
// if we have AB ABC ABCD - then AB and ABCD are not prefix neighbors
// because we have ABC of length smaller than ABCD that is also shares 
// a prefix with ABCD.
// specifically - for the input A AB ABC ABCD - this will compute
// solution based on A AB ABCD - but A AB and prefix neighbors.
public class Problem5 {
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
		
		Collection<String> noPf = new TreeSet<>();
		noPf.add(dic.get(size-1));
		for (int i=size-2; i>=0; i--){
			if( arePrefixNeighbors(dic.get(i), dic.get(i+1))){
				if (i==0)continue;
				String anchor = dic.get(i+1);
				for(int j=i-1; j>=0; j--){
					if( arePrefixNeighbors(dic.get(j), anchor)){
						noPf.add(dic.get(j));
					}
					else{
						i=j+1;
						break;
					}
				}
			}
			else{
				noPf.add(dic.get(i));
			}
		}
	
		long maxBv = 0;
		for( String s: noPf){
			maxBv += getBenefitValue(s);
		}
		System.out.println(maxBv);
		System.out.println(noPf);
	}
	
	public static boolean arePrefixNeighbors(String s1, String s2){
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
}
