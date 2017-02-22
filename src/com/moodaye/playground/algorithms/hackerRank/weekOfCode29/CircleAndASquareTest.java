package com.moodaye.playground.algorithms.hackerRank.weekOfCode29;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleAndASquareTest {

	//test for initialization
	@Test
	public void test1() {
		
		CircleAndASquare cas = new CircleAndASquare(11, 11, 5, 5, 5);
		cas.printRaster();
		char[][] raster = cas.getRaster();
		
		for (int i=0; i<raster.length; i++){
			for (int j=0; j<raster[i].length; j++){
				assertEquals('.', raster[i][j]);
			}
		}
	}
	
	@Test
	public void test2(){
		CircleAndASquare cas = new CircleAndASquare(11, 11, 5, 5, 5);
		cas.paintCircle();
		cas.printRaster();
		char[][] raster = cas.getRaster();
		assertEquals('.', raster[0][0]);
	}

}
