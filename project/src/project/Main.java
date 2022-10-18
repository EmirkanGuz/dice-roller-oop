package project;


public class Main {

	public static void main(String[] args) {
		Input.getInput();
		Dice dice = Input.newDice;
		System.out.println("You have rolled your " + dice.getSides() + " sides dice for " + dice.getTimes() + " times. Here are the results:");
		System.out.println(dice.Roll(dice.getTimes()));

	}

}

