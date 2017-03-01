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
	private double x2;
	private double y2;
	private int x3;
	private int y3;
	private double x4;
	private double y4;
	
	double a12;
	double a23;
	double a34;
	double a41; 
	
	public CircleAndASquare(int w, int h, int cx, int cy, int r,
								int x1, int y1, int x3, int y3){
		this.w = w;
		this.h = h;
		raster = new char[h][w];
		for (int i=0; i<h; i++)
			for (int j=0; j<w; j++){
				raster[i][j] = '.';
			}
		this.cx = cy;
		this.cy = cx;
		this.r = r;
		this.x1 = x1;
		this.y1 = y1;
		this.x3 = x3;
		this.y3 = y3;
		
		//compute other vertices of square
		
		double _xc = (double)(x1+x3)/2;  
		double _yc = (double)(y1+y3)/2;
		double _xd = (double)(x1-x3)/2;
		double _yd = (double)(y1-y3)/2;
		
		this.x2 = _xc - _yd;
		this.y2 = _yc + _xd;
		this.x4 = _xc + _yd;
		this.y4 = _yc - _xd;
		
		//System.out.println(x2 + "," + y2  + "," + x4 + "," + y4);
		//calculate edges
		a12 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		a23 = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
		a34 = Math.sqrt((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4));
		a41 = Math.sqrt((x4-x1)*(x4-x1) + (y4-y1)*(y4-y1));
	}
	
	public void paintCircleAndSquare(){
		for (int i=0; i<w; i++)
			for (int j=0; j<h; j++)
				if(isPointWithinCircle(i,j) ||
						isPointWithinSquare(i,j))
					raster[i][j] = '#';
	}
	
	public void paintCircle(){
		for (int i=0; i<h; i++)
			for (int j=0; j<w; j++)
				if(isPointWithinCircle(i,j))
					raster[i][j] = '#';
	}
	
	public void paintSquare(){
		for (int i=0; i<h; i++)
			for (int j=0; j<w; j++)
				if(isPointWithinSquare(j,i))
					raster[i][j] = '#';
	}
	
	private boolean isPointWithinCircle(int x, int y){
		if(x>w || y>h) return false;
		if (((x-cx)*(x-cx) + (y-cy)*(y-cy)) > r*r) return false;
		return true;
	}
	
	
	private boolean isPointWithinSquare(int x, int y){
		
		double b1 = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		double b2 = Math.sqrt((x2-x)*(x2-x) + (y2-y)*(y2-y));
		double b3 = Math.sqrt((x3-x)*(x3-x) + (y3-y)*(y3-y));
		double b4 = Math.sqrt((x4-x)*(x4-x) + (y4-y)*(y4-y));
		
		double A = (double) a12*a12;
		
		double u1 = (a12+b1+b2)/2;
		double u2 = (a23+b2+b3)/2;
		double u3 = (a34+b3+b4)/2;
		double u4 = (a41+b4+b1)/2;
		
		double A1 = Math.sqrt(u1*(u1-a12)*(u1-b1)*(u1-b2));
		double A2 = Math.sqrt(u2*(u2-a23)*(u2-b2)*(u2-b3));
		double A3 = Math.sqrt(u3*(u3-a34)*(u3-b3)*(u3-b4));
		double A4 = Math.sqrt(u4*(u4-a41)*(u4-b4)*(u4-b1));
	
		double total = A1+A2+A3+A4;
		
		if (Math.floor(total*1000) > Math.floor(A*1000))
			return false;
		else
			return true;
		}

	public void printRaster(){
		for (int i=0; i<h; i++){
			for (int j=0; j<w; j++)
				System.out.print(raster[i][j] + " ");
			System.out.println();
		}
	}
	
	public void printSquareVertices(){
		for (int i=0; i<h; i++){
			for (int j=0; j<w; j++){
				if(i==x1 && j==y1) 
					System.out.print('1' + " " );
				else if(i==x2 && j==y2) 
					System.out.print('2' + " " );
				else if(i==x3 && j==y3) 
					System.out.print('3' + " ");
				else if(i==x4 && j==y4) 
					System.out.print('4' + " " );
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
//		CircleAndASquare cas = new CircleAndASquare(3,3,5,5,2,-3,0,-1,2);
//		CircleAndASquare cas = new CircleAndASquare(4,4,5,5,2,0,0,3,3);
//		CircleAndASquare cas = new CircleAndASquare(11,11,5,5,2,0,0,3,3);
//		CircleAndASquare cas = new CircleAndASquare(11,11,5,5,5,2,2,2,8);
//		CircleAndASquare cas = new CircleAndASquare(2,2,5,5,5,0,0,1,2);

//		CircleAndASquare cas = new CircleAndASquare(20,16,9,6,5,4,14,-4,14);
		CircleAndASquare cas = new CircleAndASquare(100,100,50,50,40,2,15,2,15);
//		CircleAndASquare cas = new CircleAndASquare(3,3,3,2,1,0,0,2,0);
//		cas.paintCircle();
//		cas.printRaster();
		cas.paintCircle();
//		cas.paintSquare();
	//	cas.paintCircleAndSquare();
		cas.printRaster();
//		cas.printSquareVertices();
	}
}
