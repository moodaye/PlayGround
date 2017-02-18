package com.moodaye.playground.algorithms.hackerRank.rookie2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] counts = new int[5];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            if(types[types_i] == 1) counts[0]++;
            if(types[types_i] == 2) counts[1]++;
            if(types[types_i] == 3) counts[2]++;
            if(types[types_i] == 4) counts[3]++;
            if(types[types_i] == 5) counts[4]++;
        }
      
        int[] maxType = new int[5];
        int maxCount = -1;
        for(int i=4; i>=0; i--){
            if(counts[i] >= maxCount ){
                maxType[i] = 1;
                for (int j=i+1; j<5; j++){
                    if (maxType[j] == 1) maxType[j] = 0;
                }
                maxCount = counts[i];
            } 
            else if(counts[i] < maxCount ){
                continue;  
            }
        }
        
        for (int i=0; i<5; i++){
            if (maxType[i] == 1){
                System.out.println(i+1);
            }
        }
}
}
