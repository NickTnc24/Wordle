package application;

import java.util.ArrayList;

public class Shadow{
	private String[][] answerarray;
	private int currX;
	private int currY;
	public Shadow(){
		answerarray = new String[6][5];
		currX = 0;
		currY = 0;
	}
	
	public void addLetter(String l) {
		if (currY < 5 && currX < 6) {
			answerarray[currX][currY] = l;
			currY += 1;
		}
	}
	
	public void delLetter() {
		if (currY > 0) {	
			answerarray[currX][currY-1] = "";	
			currY-=1;
		}
	}
	
	public String at(int x, int y){
		return answerarray[x][y];
	}
	
	public int getX() {
		return currX;
	}
	
	public int getY() {
		return currY;
	}
	
	public void setX(int x) {
		currX = x;
	}
	
	public void setY(int y) {
		currY = y;
	}
	
	public void clear() {
		currX = 0;
		currY = 0;
		answerarray = new String[6][5];
	}
}