/*Joseph Jesse
 * Object Oriented Programming
 * 2/23/2024
 * Create a game of Rock Paper Scissors
 */

import java.util.Scanner;
import java.util.Random;

public class Assignment3 {

	//Takes random generated number and user chosen number to determine the winner
	public static void chooseWin(int x, int y) {
		
		int rock = 1;
		int paper = 2;
		int scissors = 3;
		
		//different win conditions
		if (x == rock && y == scissors) {
			System.out.println("Rock beats Scissors! You Win!");
            System.out.println("");
		}
		else if (x == scissors && y == paper) {
			System.out.println("Scissors beats Paper! You Win!");
            System.out.println("");
		}
		else if (x == paper && y == rock) {
			System.out.println("Paper beats Rock! You Win!");
            System.out.println("");
		}
		else if (y == rock && x == scissors) {
			System.out.println("Rock beats Scissors! You Lose!");
            System.out.println("");
		}
		else if (y == scissors && x == paper) {
			System.out.println("Scissors beats Paper! You Lose!");
            System.out.println("");
		}
		else if (y == paper && x == rock) {
			System.out.println("Paper beats Rock! You Lose!");
            System.out.println("");
		}
		else {
			System.out.println("You both picked the same move! Its a tie!");
            System.out.println("");
		}
	}
	
	
	//Determines if there is an error and loops till corrected
	public static int ifError(int x) {
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Error, input should be a number between 1 and 3");
			System.out.println("");
			System.out.print("Pick Your Move: ");
			x = scan.nextInt();
			System.out.println("");
		}		while(x < 1 || x > 3);
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("To play the game you will choose one of three options Rock, Paper, or Scissors.");
		System.out.println("Enter a number from one to three to make your choice.");
		System.out.println("To choose Rock pick 1, to choose Paper pick 2, to choose Scissors pick 3.");
		System.out.println("A random number will be generated to play against.");
		System.out.println("If one player chooses Rock and the other player chooses Scissors, then Rock wins.");
		System.out.println("If one player chooses Scissors and the other player chooses Paper, then Scissors wins.");
		System.out.println("If one player chooses Paper and the other player chooses Rock, then Paper wins.");
		System.out.println("If both players make the same choice, the game must be played again to determine the winner.");
		System.out.println("Good Luck!");		 

		while (true) {
		Scanner scan = new Scanner(System.in);
		//Generates a random number between 1 and 3
		Random gen = new Random();
		int compChoice = gen.nextInt(3) + 1;
	try {
		System.out.println("Pick Your Move: ");
		int playerChoice = scan.nextInt();
		System.out.print("");
		
		//determines if there is an error from the user input
		if (playerChoice < 1 || playerChoice > 3) {
		ifError(playerChoice);
		}
		
		//Determines the winner between the player and computer
		chooseWin(playerChoice, compChoice);
		
		//Continues the game or breaks the loop
		System.out.println("Play another game? (Y/N): ");
        char replay = scan.next().charAt(0);
        if (replay == 'Y' || replay == 'y') {
            System.out.println("Good Luck!");
            System.out.println("");
		}
        else {
        	break;
        }
        //Finds non number related errors from the user input
		} catch (java.util.InputMismatchException e) {
            System.out.println("Error, input should be a number between 1 and 3");
            System.out.println("");
	}

}
}
}
