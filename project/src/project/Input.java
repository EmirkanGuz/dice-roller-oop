package project;

import java.util.Scanner;

public class Input {

	private static Scanner sc = new Scanner(System.in);
	public static Dice newDice = new Dice();
	
	
	public static void getInput() {
		
		while(true) {
			
			System.out.println("Enter how many sides you want on your dice: ");
			String sidesStr =  sc.next();
			try {
				int sides = Integer.parseInt(sidesStr);
				if (sides < 4) {
					System.out.println("Sides of your dice must be equal or greater than 4, try again!");
				}
				else {
					newDice.setSides(sides);
					break;
				}
			}
			catch(NumberFormatException e){
				System.out.println("Please enter a number!");
				}}
			
		
		while(true) {
			System.out.println("Enter how many times you want to roll your " + newDice.getSides() + " sides dice: ");
			String timesStr = sc.next();
			try {
				int times = Integer.parseInt(timesStr);
				if (times < 1) {
					System.out.println("Please enter a valid number!");
				}
				else {
					newDice.setTimes(times);
					break;
				}
				}
			catch(NumberFormatException e) {
				System.out.println("Please enter a number!");
				
			}}}}

