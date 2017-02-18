package com.moodaye.playground.algorithms;

public class SquareDigits {

	public static void main(String[] args) {
		
		System.out.println(squareDigits(9119));
	
	}

	  public static int squareDigits(int n) {
	    if (n<0) n = n*-1;

	    StringBuffer sb = new StringBuffer();
	    String strNum = String.valueOf(n);
	    char[] charNum = strNum.toCharArray();
	    
	    for(int i=0; i<charNum.length; i++){
	      int ci = Integer.valueOf(String.valueOf(charNum[i]));
	      String s = String.valueOf(ci*ci);
	      sb.append(s);
	    }
	    return Integer.valueOf(sb.toString());
	  }
	  
	  /**
	   * A more elegant solution
	   * @param n
	   * @return
	   */
	  public static int squareDigits2(int n){
		  String sqD = "";
		  int digit;
		  
		  while(n != 0){
			  digit = n%10;
			  sqD = digit*digit + sqD;
			  n /= 10;
		  }
		  
		  
		  
		  
		  	return 0;
	  }
}
