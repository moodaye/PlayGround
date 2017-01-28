package com.moodaye.playground.algorithms.grokkingAlgorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberInList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(20104);
		numbers.add(-300);
		numbers.add(74444);
		System.out.println(maxNumber(numbers));

	}
	
	
	private static Integer maxNumber(List<Integer> numbers){
		
		//Base Case
		if (numbers == null){
			return null;
		}
		else if (numbers.size() == 1){
			return numbers.get(0);
		}
		
		Integer currentMax = numbers.get(0);
		// TODO - understand the subList call and how the 2 lists relate to each other (see javadocs)
		List<Integer> subNumbers = numbers.subList(1, numbers.size());
		Integer nextMax = maxNumber(subNumbers);
		
		return (currentMax > nextMax ? currentMax : nextMax);
	}

}
