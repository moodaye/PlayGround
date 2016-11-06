package com.moodaye.playground.statesAndCapitolsQuiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class createQuiz  {

	public static void main(String[] args) {
		//1.read file - make sure you have checks if no file is found
		//allow path to file on command line; allow path to output file on command line
		
		//2. initialize and populate collection of state and capitals
		//ensure you have 50 distinct values for states.  
		//ensure you have 50 capitals
		//the number 50 should be configurable
		
		//3. create a listing of the states in random order
		//ensure that each time you run this - it create a random order.
		//for each state create 4 optional capitals - one correct / 3 incorrect
		//order of appearance of these options should be random
		//the number of options is configurable.  One of the these will always be correct.
		
		//4. Write out file with questions and optional answers.
		//The question (template) should be configurable.
		
		Map statesAndCapitals = createStateCapitalMap("StateAndCapitalList");
		writeQuiz("StateAndCapitalQuiz", statesAndCapitals);
	}
	
	private static Map<String, String> createStateCapitalMap(String inputFileName){
		
		Map<String,String> stateCapitalMap = new HashMap<String,String>();
		String state[] = new String[50];
		String capital[] = new String[50];
		
		BufferedReader is = null;
		try{
			is = new BufferedReader(new FileReader("StateAndCapitalList"));
			for (int i = 0; i < 7; i++){
				state[i] = is.readLine();
				//System.out.println("State = " + state[i]);
				capital[i] = is.readLine();
			//	System.out.println("Capital = " + capital[i]);
				stateCapitalMap.put(state[i], capital[i]);
			}
		}
		catch (FileNotFoundException e){
			System.err.println("Check file path and name");
		}
		catch (IOException e){
			System.err.println("Check file - error");
		}
		
	//	System.out.println("capital of " + state[3] + " is " + capital[3]);
				
		return stateCapitalMap;
	}
	
	private static void writeQuiz(String filenamne, Map<String,String> questionsAndAnswers){
		Set<String> questions = questionsAndAnswers.keySet();
		
		Random random = new Random();
		Object[] questionsArray = (Object[]) questions.toArray();

		int count = questionsArray.length;
		for (int i=0; i>1; i--){
			swap(questionsArray, i-1, random.nextInt(i));
		}
		
		
		for (int i=0; i < questionsArray.length; i++){
			String state = (String) questionsArray[i];
			System.out.println("State = " +  state + " Capitol = " + questionsAndAnswers.get(state));
		}
	}
	
	public static void swap(Object[] array, int i, int j){
		Object temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	

}
