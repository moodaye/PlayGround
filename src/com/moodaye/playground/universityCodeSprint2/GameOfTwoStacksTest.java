package com.moodaye.playground.universityCodeSprint2;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfTwoStacksTest {

	@Test
	public void test() {
		
		int[] s1 = {2};
		int[] s2 = {3};
		assertEquals(2, new GameOfTwoStacks(s1,s2,5).playGame());
		assertEquals(1, new GameOfTwoStacks(s1,s2,2).playGame());
		assertEquals(1, new GameOfTwoStacks(s1,s2,3).playGame());
		assertEquals(0, new GameOfTwoStacks(s1,s2,1).playGame());
		
		
		int[] s3 = {100};
		int[] s4 = {4,6,2,2,2,2,2,100};
		assertEquals(7, new GameOfTwoStacks(s3,s4,50).playGame());
		assertEquals(8, new GameOfTwoStacks(s3,s4,120).playGame());
		assertEquals(7, new GameOfTwoStacks(s3,s4,104).playGame());
		
		
		int[] s5 = {2};
		int[] s6 = {2};
		assertEquals(1, new GameOfTwoStacks(s5,s6,2).playGame());
		assertEquals(2, new GameOfTwoStacks(s5,s6,4).playGame());
		assertEquals(1, new GameOfTwoStacks(s5,s6,3).playGame());
		
		int[] s7 = {4,6,2,2,2,2,2,100};
		int[] s8 = {100};
		assertEquals(7, new GameOfTwoStacks(s7,s8,104).playGame());
		
		int[] s9 =  {10};
		int[] s10 = {2,3,4};
		assertEquals(3, new GameOfTwoStacks(s9,s10,12).playGame());
		assertEquals(3, new GameOfTwoStacks(s9,s10,15).playGame());
		assertEquals(1, new GameOfTwoStacks(s9,s10,2).playGame());
		assertEquals(4, new GameOfTwoStacks(s9,s10,222).playGame());
		
		int[] s11 = {4,6};
		int[] s12 = {4,6};
		assertEquals(2, new GameOfTwoStacks(s11,s12,10).playGame());
		assertEquals(1, new GameOfTwoStacks(s11,s12,4).playGame());
		assertEquals(1, new GameOfTwoStacks(s11,s12,6).playGame());
		assertEquals(3, new GameOfTwoStacks(s11,s12,14).playGame());
		assertEquals(4, new GameOfTwoStacks(s11,s12,20).playGame());
		assertEquals(4, new GameOfTwoStacks(s11,s12,34).playGame());
		
		int[] s13 = {6,4};
		int[] s14 = {6,4};
		assertEquals(0, new GameOfTwoStacks(s13,s14,4).playGame());
		assertEquals(1, new GameOfTwoStacks(s13,s14,7).playGame());
		assertEquals(2, new GameOfTwoStacks(s13,s14,10).playGame());
		
		int[] s15 = {100, 1,1,1,1,1,1};
		int[] s16 = {200,1,1,1,1,1,1,1};
		assertEquals(15, new GameOfTwoStacks(s15,s16,4000).playGame());
		assertEquals(8, new GameOfTwoStacks(s15,s16,301).playGame());
		assertEquals(1, new GameOfTwoStacks(s13,s14,7).playGame());
		assertEquals(2, new GameOfTwoStacks(s13,s14,10).playGame());
		
		int[] s17 = {1,100,1,1,1,1,1};
		int[] s18 = {200,1,300,1,1,1,1,1,1};
		assertEquals(7, new GameOfTwoStacks(s17,s18,200).playGame());
	}

}
