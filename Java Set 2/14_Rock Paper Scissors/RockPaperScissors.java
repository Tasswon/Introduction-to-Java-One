/** Name: Joseph Tassone
 *  Description: Plays a game of rock, paper, scissors
 */ 

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.print("Please enter rock (0) paper (1) scissors (2): ");

		//Allows player to input a number, and causes opponent to enter a random number
		int opponent = (int)(Math.random() * 3);
		int player = input.nextInt();
		
		//Compares player's input versus opponents random number; to determine a winner
		if ((player == 0) && (opponent == 1)) {
			System.out.println("The computer is paper. You are rock. You lose!");
		}
		else if ((player == 0) && (opponent == 2)) {
			System.out.println("The computer is scissors. You are rock. You win!");
		}
		else if ((player == 0) && (opponent == 0)) {
			System.out.println("The computer is rock. You are rock. You tie!");
		}
		else if ((player == 1) && (opponent == 2)){
			System.out.println("The computer is scissors. You are paper. You lose!");
		}
		else if ((player == 1) && (opponent == 0)) {
			System.out.println("The computer is rock. You are paper. You win!");
		}
		else if ((player == 1) && (opponent == 1)) {
			System.out.println("The computer is paper. You are paper. You tie!");
		}
		else if ((player == 2) && (opponent == 0)) {
			System.out.println("The computer is rock. You are scissors. You lose!");
		}
		else if ((player == 2) && (opponent == 1)) {
			System.out.println("The computer is paper. You are scissors. You win!");
		}
		else if ((player == 2) && (opponent == 2)) {
			System.out.println("The computer is scissors. You are scissors. You tie!");	
		}
										
		//If the player enters a number greater than 2, message asks player to restart	
		else {
		System.out.println("Please restart and enter a number between 0 and 2");
		}
	}
}
