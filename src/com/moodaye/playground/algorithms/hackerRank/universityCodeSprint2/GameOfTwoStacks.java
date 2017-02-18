package com.moodaye.playground.algorithms.hackerRank.universityCodeSprint2;

import com.moodaye.playground.algorithms.grokkingAlgorithms.recursion.Sum;

public class GameOfTwoStacks {
	int[] stack1;
	int[] stack2;
	int max;

	public static void main(String[] args) {
		int[] stack1 = {4,2,4,6,1};
		int[] stack2 = {2,1,8,5};
		int x = 10;
		/*int[] stack1 = {4};
		int[] stack2 = {2,3};
		int x = 10;*/
		
		int count = new GameOfTwoStacks(stack1, stack2, x).playGame();
		System.out.println(count);
	}
	
	public GameOfTwoStacks(int[] stack1, int[] stack2, int max){
		this.stack1 = stack1;
		this.stack2 = stack2;
		this.max = max;
	}
	
	public int playGame(){
		Node root = new Node(0,0,0,0,0,0);
		return inOrderTraversal(root);
	}
	
	int inOrderTraversal(Node node){
		int countThusFar  = node.countThusFar;
		int index1 = node.index1;
		int index2 = node.index2;
		
		if (node.sumThusFar > max){
			return countThusFar;
		}
		
		Node node1 = null;
		Node node2 = null;
		int count1 = countThusFar;
		int count2 = countThusFar;
		countThusFar++;
		
		if (index1 < stack1.length){
			node1 = new Node(1, index1+1, index2, stack1[index1], node.sumThusFar, countThusFar); 
			count1 = inOrderTraversal(node1);
		}
		
		if (index2 < stack2.length){
			node2 = new Node(2, index1, index2+1, stack2[index2], node.sumThusFar, countThusFar); 
			count2 = inOrderTraversal(node2);

		}
		
		return (count1 > count2 ? count1 : count2);
	}
	
	
	
	/**
	 * this has issues - will need to change to a backtracking algo
	 */
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
class Node{
	//stack 1(a) or 2(b) or 0(root)?
	int s;
	
	int index1;
	int index2;
	int value;
	
	int sumThusFar;
	int countThusFar;
	
	Node(int s, int index1, int index2, int value, int sumThusFar, int countThusFar){
		this.s = s;
		this.index1 = index1;
		this.index2 = index2;
		this.value = value;
		this.sumThusFar = sumThusFar + value;
		this.countThusFar = countThusFar;
	}

	Node childA;
	Node childB;
}
