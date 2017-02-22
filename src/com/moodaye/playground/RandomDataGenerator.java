package com.moodaye.playground;

import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Utility class for building 
 * random data files
 * @author Rajiv
 *
 */
public class RandomDataGenerator {

	public static void main(String[] args) {
	
		randomLong("c:\\temp\\file1.txt", 1000000000);

	}
	
	private static void randomLong(String fileName, long count){
		PrintWriter pw = null;
		try{
			pw = new PrintWriter(fileName);
			Random rand = new Random(count);
			for(int i=0; i<count; i++){
				long x = rand.nextInt(Integer.MAX_VALUE);
				pw.println(x + " ");
			}
		}
		catch (Exception e){
			
		}
		finally{
			pw.close();
		}
	}

}
