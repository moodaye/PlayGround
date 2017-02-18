package com.moodaye.playground.universityCodeSprint2;

public class GameOfTwoStacks {

	public static void main(String[] args) {
		int[] stack1 = {4,2,4,6,1};
		int[] stack2 = {2,1,8,5};
		int x = 10;
		
		System.out.println(maxScore(stack1, stack2,x));
	}
	
	public static int maxScore(int[] stack1, int[] stack2, int max){
		int i=0,j=0,sum=0,count=0;
		boolean stack1Done = false;
		boolean stack2Done = false;
		
		while(true){
			if (i == stack1.length) stack1Done = true;
			if (j == stack2.length) stack2Done = true;
			
			if(stack1Done){
				if(stack2Done){
					break;
				}
				else{
					sum+=stack2[j++];
					if(sum<max){
						count++;
						continue;
					}
					else{
						break;
					}
				}
			}
			else if(stack2Done){
				sum+=stack2[i++];
				if(sum<max){
					count++;
					continue;
				}
				else{
					break;
				}
			}
			
			
			if(stack1[i] < stack2[j]){
				sum+=stack1[i++];
			}
			else{
				sum+=stack2[j++];
			}
			if (sum<=max){
				count++;
			}
			else{
				break;
			}
		}
		return count;
	}
}
