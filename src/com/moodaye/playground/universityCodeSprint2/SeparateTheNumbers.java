package com.moodaye.playground.universityCodeSprint2;

import java.util.Scanner;

public class SeparateTheNumbers {
	  public static void main(String[] args) {
		  System.out.println("please enter q and q s's");
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            System.out.println(yesOrNo(s));
	            // your code goes here
	        }
	    }
	    
	    private static String yesOrNo(String s){
	      char[] carr = s.toCharArray();
	       int[] ia = new int[s.length()];
	        
	      for (int i=0; i<carr.length; i++){
	            ia[i] = Integer.valueOf(Character.valueOf(carr[i]).toString());
	      }

	        int prev = -1;
	        int mfactor = 0;
	        for(int i=ia.length-1; i>=0; i--){
	            if(ia[i] == 0){
	               if(i!=0){
	                   mfactor++; 
	                   continue;
	               }
	                else{
	                    //???????
	                }
	            }
	            else{
	                ia[i] = ia[i] * (int) Math.pow(10,mfactor);
	            }
	            if(i == ia.length-1){
	            	prev = ia[i];
	            	continue;
	            }
	            if ((prev - ia[i]) != 1){
	            	return "NO";
	            }
	            else{
	            	prev = ia[i];
	            }
	        }
	        
	        return "YES";
	            
	    }
}
