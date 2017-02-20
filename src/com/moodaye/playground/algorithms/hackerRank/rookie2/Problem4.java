package com.moodaye.playground.algorithms.hackerRank.rookie2;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int gridSize = in.nextInt();
		
		Coordinate startingSquare = new Coordinate(0, 0, gridSize-1, gridSize-1);
		Coordinate targetSquare = new Coordinate(gridSize-1, gridSize-1, gridSize-1, gridSize-1);
	
		for (int i=1; i<gridSize; i++){
			for (int j=1; j<gridSize; j++){
				KnightProblem kp = new KnightProblem(startingSquare, 25, i, j, targetSquare);
				System.out.print(kp.solve() + " ");
			}
			System.out.println();
		}
	}
	
	

}

class KnightProblem{
	
	Coordinate startingSquare;
	Coordinate targetSquare;
	int stepx;
	int stepy;
	int gridSize;
	int minStepsToSolution;
		
	private int solution[][];
	
	KnightProblem(Coordinate startingSquare, int gridSize, int stepx, int stepy, Coordinate targetSquare){
		this.startingSquare = startingSquare;
		this.gridSize = gridSize;
		this.stepx = stepx;
		this.stepy = stepy;
		solution = new int[gridSize][gridSize];
		this.targetSquare = targetSquare;
		minStepsToSolution = Integer.MAX_VALUE;
		
		for (int i=0; i<gridSize; i++) 
			for(int j=0; j<gridSize; j++) 
				solution[i][j] = Integer.MAX_VALUE;
	}
	
	
	public int solve(){
		solve(startingSquare, 0);
		if (minStepsToSolution == Integer.MAX_VALUE){
			minStepsToSolution = -1;
		}
		return minStepsToSolution;
	}
	
	public void solve(Coordinate currentPosition, int numberOfSteps){
		
		if (++numberOfSteps >= minStepsToSolution) return;
		
		Coordinate newPosition1 = Coordinate.add(currentPosition,  stepx,  stepy);
		Coordinate newPosition2 = Coordinate.add(currentPosition, -stepx,  stepy);
		Coordinate newPosition3 = Coordinate.add(currentPosition,  stepx, -stepy);
		Coordinate newPosition4 = Coordinate.add(currentPosition, -stepx, -stepy);
		Coordinate newPosition5 = Coordinate.add(currentPosition,  stepy,  stepx);
		Coordinate newPosition6 = Coordinate.add(currentPosition, -stepy,  stepx);
		Coordinate newPosition7 = Coordinate.add(currentPosition,  stepy, -stepx);
		Coordinate newPosition8 = Coordinate.add(currentPosition, -stepy, -stepx);
		
		checkNewPositionAndSolve(newPosition1, numberOfSteps);
		checkNewPositionAndSolve(newPosition2, numberOfSteps);
		checkNewPositionAndSolve(newPosition3, numberOfSteps);
		checkNewPositionAndSolve(newPosition4, numberOfSteps);
		checkNewPositionAndSolve(newPosition5, numberOfSteps);
		checkNewPositionAndSolve(newPosition6, numberOfSteps);
		checkNewPositionAndSolve(newPosition7, numberOfSteps);
		checkNewPositionAndSolve(newPosition8, numberOfSteps);
		
	}
	
	private void checkNewPositionAndSolve(Coordinate newPosition, int numberOfSteps){
		 if( newPosition != null){
			if (newPosition.equals(targetSquare)){
				minStepsToSolution = numberOfSteps;
			}
			else if (solution[newPosition.getX()][newPosition.getY()] > numberOfSteps){
				solution[newPosition.getX()][newPosition.getY()] = numberOfSteps;
				solve(newPosition, numberOfSteps);
			}
		}
	}
}



class Coordinate{
	int x;
	int y;
	int maxX = Integer.MAX_VALUE;
	int maxY = Integer.MAX_VALUE;
	
	Coordinate(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Coordinate(int x, int y, int maxX, int maxY){
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

	public boolean equals(Object o){
		if (o == null) return false;
		if (o.getClass() != Coordinate.class) return false;
		Coordinate c = (Coordinate) o;
		
		if ( (c.getX() == this.getX() && c.getY() == this.getY()) ) return true;
		return false;
	}
		
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//TODO - returning null not good
	static Coordinate add(Coordinate c, int a, int b){
		int xCoord = c.x + a;
		int yCoord = c.y + b;
		
		if (xCoord < 0 || yCoord < 0) return null;
		if (xCoord > c.maxX || yCoord > c.maxY) return null;
				
		return new Coordinate(c.x + a, c.y +b, c.maxX, c.maxY);
	}
}
