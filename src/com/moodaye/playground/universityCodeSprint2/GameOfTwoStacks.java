package com.moodaye.playground.universityCodeSprint2;

public class GameOfTwoStacks {

	public static void main(String[] args) {
//		int[] stack1 = {4,2,4,6,1};
//		int[] stack2 = {2,1,8,5};
//		int x = 10;
		int[] stack1 = {2};
		int[] stack2 = {2};
		int x = 2;
		System.out.println(new GameOfTwoStacks(stack1, stack2, x).playGame());
	//	System.out.println(new GameOfTwoStacks(stack1, stack2, 7).playGame());
	//	System.out.println(new GameOfTwoStacks(stack1, stack2, 3).playGame());
	//	System.out.println(new GameOfTwoStacks(stack1, stack2, 4).playGame());
	//	System.out.println(new GameOfTwoStacks(stack1, stack2, 0).playGame());
	}
	
	
	int[] stack1 ;
	int[] stack2; 
	int max;
	int ans = Integer.MIN_VALUE;
	
	GameOfTwoStacks(int[] stack1, int[] stack2, int max){
		this.stack1 = stack1;
		this.stack2 = stack2;
		this.max = max;
	}
	
	public int playGame(){
		return calculatePath3();
	}

	//failing one test on HackerRank and
	//timing out
	private int calculatePath(int si1, int si2, int sum, int cnt){
		if(max == 0) return 0;
		if(sum >= max) return cnt;
	
		if(si1 == stack1.length && si2 == stack2.length){
			return cnt;
		}
		
		
		int cnt1 = cnt;
		int cnt2 = cnt;
		cnt++;
		si1++;
		if(si1 != stack1.length){
			int sum1 = sum + stack1[si1];
			if(sum1 <= max)
				cnt1 = calculatePath(si1, si2, sum1, cnt);
		}
		
		si1--;
		si2++;
		if(si2 != stack2.length){
			int sum2 = sum + stack2[si2];
			if(sum2 <= max)
				cnt2 = calculatePath(si1, si2, sum2, cnt);
		}
		
		int currAns = (cnt1 > cnt2 ? cnt1 : cnt2);
		if (currAns > ans) ans = currAns;
		return currAns;
	}

	//transcribing c code on hackerrank editorial
	//Time complexity = O(n)
	private int calculatePath3(){
		long sum = 0;
		int x = 0;
		int y = 0;
		while (x < stack1.length  && sum + stack1[x] <= max){
			sum += stack1[x++];
		}
		int ans = x;
		
		while (y < stack2.length && x >= 0 ){
			sum += stack2[y++];
			while ( sum > max && x > 0){
				sum -= stack1[--x];
			}
			if ( sum <= max && ans < x + y ){
				ans = x + y;
			}
		}
		return ans;
	}

	//no recursion method
	//needs to be fixed.
	private int calculatePath2(){
		
		//first find max number of integers that are less than 
		//x from stack1.
		//then iterate by removing one integer at a time 
		//from this answer and adding from stack2
		
		int maxCnt = 0;
		int maxSum = 0;
		int i1 = 0;
		
		maxSum += stack1[i1];
		while (maxSum <= max){
			maxCnt++;
			i1++;
			if(i1 == stack1.length){
				break;
			}
			maxSum += stack1[i1];
		}
		i1--;
		int s1stop = i1;
		
		//at this point, i1 has index reflecting point in stack1 where x is reached
		//Now iterate back from i1
		if(i1 == -1){
			int i2 = 0;
			while(maxSum <= max){
				maxCnt++;
				i2++;
				if(i2 == stack2.length){
					break;
				}
				maxSum += stack2[i2];
			}
		}
		else{
			while(i1 >= 0){
				if (maxSum == max){
					i1--;
					continue;
				}
				if(i1 != s1stop)
					maxSum -= stack1[i1];
				int i2 = 0;
				int stack2Sum = maxSum;
				while(i2 < stack2.length){
					stack2Sum += stack2[i2];
					if(stack2Sum >= max){
						break;
					}
					i2++;
				}
				if(i1+1+i2+1 > maxCnt){
					maxCnt = i1 + 1 + i2 + 1;
				}
				i1--;
			}
		}
		return maxCnt;
	}
	
}



