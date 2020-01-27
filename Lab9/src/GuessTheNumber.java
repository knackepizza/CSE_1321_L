/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 9
*/

import java.util.Scanner;

public class GuessTheNumber {
	
	static int getRandomNum() {
		// Random number from 1 to 20
		return (int) Math.floor(Math.random() * 20);
	}
	
	static int firstGuess() {
		Scanner scnr = new Scanner(System.in);
		System.out.print("What is your first guess? ");
		return scnr.nextInt();
	}
	
	static boolean highOrLow(int num, int random) {
		if (num > random) {
			System.out.println("Too high!");
			return false;
		} else if (num < random) {
			System.out.println("Too low!");
			return false;
		} else {
			System.out.println("You got it!");
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int playAgain = 1;

		while (playAgain == 1) {
			int theGuess = firstGuess();
			int randomNum = getRandomNum();

			while (highOrLow(theGuess, randomNum) == false) {
				System.out.print("Guess again: ");
				theGuess = scnr.nextInt();
			}

			System.out.print("\nWant to play again? (0 no / 1 yes) ");
			playAgain = scnr.nextInt();
		}

		System.out.println("\nThanks for playing.");
		
		scnr.close();
	}

}
