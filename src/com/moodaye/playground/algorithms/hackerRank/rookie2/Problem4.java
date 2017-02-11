package com.moodaye.playground.algorithms.hackerRank.rookie2;

public class Problem4 {
	
	

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
		minStepsToSolution = -1;
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
		
		if ( newPosition1 != null){
			if (newPosition1.equals(targetSquare)){
				minStepsToSolution = numberOfSteps;
				return;
			}
			else if (solution[newPosition1.getX()][newPosition1.getY()] == 1){
				return;
			}
			solution[newPosition1.getX()][newPosition1.getY()] = 1;
			solve(newPosition1, numberOfSteps);
		}
	
		if ( newPosition2 != null){
			if (newPosition1.equals(targetSquare)){
				minStepsToSolution = numberOfSteps;
				return;
			}
			else if (solution[newPosition2.getX()][newPosition2.getY()] == 1){
				return;
			}
			solution[newPosition2.getX()][newPosition2.getY()] = 1;
			solve(newPosition2, numberOfSteps);
		}
		if ( newPosition3 != null){
			if (newPosition3.equals(targetSquare)){
				minStepsToSolution = numberOfSteps;
				return;
			}
			solve(newPosition3, numberOfSteps);
		}
		if ( newPosition4 != null){
			if (newPosition4.equals(targetSquare)){
				minStepsToSolution = numberOfSteps;
				return;
			}
			solve(newPosition4, numberOfSteps);
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
