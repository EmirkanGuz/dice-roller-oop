package project;

import java.util.Random;
import java.util.ArrayList;


public class Dice {

	private Random roll = new Random();
	private int times;
	private int sides;
	
	public Dice() {
		
	}
	
	private int Roll() {
		return roll.nextInt(1, sides+1);
	}
	
	public int getSides() {
		return sides;	
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int getTimes() {
		return times;
	}
	
	public void setTimes(int times) {
		this.times = times;
	}
	
	public ArrayList<Integer> Roll(int times) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		for(int i = 1; i <= times; i++) {
			results.add(Roll());
		}
		return results;
		
	}
}
