package com.moodaye.playground.hackerrank.WomensCodeSprint3;
import java.util.*;

//Max Points = 20; Difficulty = E
public class AsciiFlower {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int r = in.nextInt();
	        int c = in.nextInt();
	        String top = "..O..";
	        String mid = "O.o.O";
	        while(r-- > 0){
	            for(int i=1; i<=c; i++){
	               System.out.print(top);
	            }
	            System.out.println();
	            for(int i=1; i<=c; i++){
	               System.out.print(mid);
	            }
	            System.out.println();
	            for(int i=1; i<=c; i++){
	               System.out.print(top);
	            }
	            System.out.println();
	        }
	        
	    }
}
