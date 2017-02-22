package com.moodaye.playground.algorithms.hackerRank.weekOfCode29;

import java.io.PrintWriter;

public class CircleAndASquare {
	private char[][] raster;
	private int h;
	private int w;
	private int cx;
	private int cy;
	private int r;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private int x4;
	private int y4;
	
	
	public CircleAndASquare(int w, int h, int cx, int cy, int r,
								int x1, int y1, int x3, int y3){
		this.w = w;
		this.h = h;
		raster = new char[w][h];
		for (int i=0; i<w; i++)
			for (int j=0; j<h; j++)
				raster[i][j] = '.';
		this.cx = cx;
		this.cy = cy;
		this.r = r;
		this.x1 = x1;
		this.y1 = y1;
		this.x3 = x3;
		this.y3 = y3;
		
		//compute other vertices of square
		this.x2 = ( x1 +x3 -y1 +y3) / 2;
		this.y2 = ( x1 -x3 +y1 +y3) / 2;
		this.x4 = ( x1 +x3 +y1 -y3) / 2;
		this.y4 = (-x1 +x3 +y1 +y3) / 2;
		
		System.out.println(x2 + "," + y2  + "," + x4 + "," + y4);
	}
	
	public void paintCircleAndSquare(){
		for (int i=0; i<w; i++)
			for (int j=0; j<h; j++)
				if(isPointWithinCircle(i,j) ||
						isPointWithinSquare(i,j))
					raster[i][j] = '#';
	}
	
	public void paintCircle(){
		for (int i=0; i<w; i++)
			for (int j=0; j<h; j++)
				if(isPointWithinCircle(i,j))
					raster[i][j] = '#';
	}
	
	public void paintSquare(){
		for (int i=0; i<w; i++)
			for (int j=0; j<h; j++)
				if(isPointWithinSquare(i,j))
					raster[i][j] = '#';
	}
	
	private boolean isPointWithinCircle(int x, int y){
		if(x>=w || y>=h) return false;
		if (((x-cx)*(x-cx) + (y-cy)*(y-cy)) > r*r) return false;
		return true;
	}
	
	private boolean isPointWithinSquare(int x, int y){
		if(x>=w || y>=h) return false;
		
		if (((x1-x)*(x1-x) + (y1-x)*(y1-x) + (x3-x)*(x3-x) + (y3-y)*(y3-y)) >
			((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3)))
				return false;
		
		return true;
	}
	

	public void printRaster(){
		for (int i=0; i<w; i++){
			for (int j=0; j<h; j++)
				System.out.print(raster[i][j] + " ");
			System.out.println();
		}
	}
	
	public void printSquareVertices(){
		for (int i=0; i<w; i++){
			for (int j=0; j<h; j++){
				if(i==x1 && j==y1) 
					System.out.print('#' + " " );
				else if(i==x2 && j==y2) 
					System.out.print('#' + " " );
				else if(i==x3 && j==y3) 
					System.out.print('#' + " ");
				else if(i==x4 && j==y4) 
					System.out.print('#' + " " );
				else
					System.out.print(raster[i][j] + " " );
			}
			System.out.println();
		}
	}
	
	public char[][] getRaster(){
		return raster;
	}
	
	public static void main(String[] args) {
		CircleAndASquare cas = new CircleAndASquare(11,11,5,5,2,0,0,3,3);
//		CircleAndASquare cas = new CircleAndASquare(11,11,5,5,5,0,0,3,3);
//		cas.paintCircle();
//		cas.printRaster();
		cas.paintCircle();
		cas.paintSquare();
		cas.paintCircleAndSquare();
	}
}
