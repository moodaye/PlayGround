package com.moodaye.playground.algorithms.hackerRank.rookie2;

public class Problem4 {
	
	public static void main(String[] args){
		Coordinate startingSquare = new Coordinate(0, 0);
		Coordinate targetSquare = new Coordinate(4,4);
		
		KnightProblem kp = new KnightProblem(startingSquare, 5, 1, 2, targetSquare);
		System.out.println(kp.solve());
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
		//for (int i: solution) solution[i][i] = Integer.MAX_VALUE;
		this.targetSquare = targetSquare;
		minStepsToSolution = Integer.MAX_VALUE;
	}
	
	
	public int solve(){
		solve(startingSquare, 0);
		return minStepsToSolution;
	}
	
	public void solve(Coordinate currentPosition, int numberOfSteps){
		
		if (++numberOfSteps >= minStepsToSolution) return;
		
		Coordinate newPosition1 = Coordinate.add(currentPosition,  stepx, stepy);
		Coordinate newPosition2 = Coordinate.add(currentPosition, -stepx, stepy);
		Coordinate newPosition3 = Coordinate.add(currentPosition,  stepx,-stepy);
		Coordinate newPosition4 = Coordinate.add(currentPosition, -stepx,-stepy);
		
		checkNewPositionAndSolve(newPosition1, numberOfSteps);
		checkNewPositionAndSolve(newPosition2, numberOfSteps);
		checkNewPositionAndSolve(newPosition3, numberOfSteps);
		checkNewPositionAndSolve(newPosition4, numberOfSteps);
		
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
	
	Coordinate(int x, int y){
		this.x = x;
		this.y = y;
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
				
		return new Coordinate(c.x + a, c.y +b);
	}
}
