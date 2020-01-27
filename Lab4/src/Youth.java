/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class Youth {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput;
		
		System.out.print("Enter your age: ");
		userInput = scnr.nextInt();
		
		System.out.println("You entered: " + userInput);

		if (userInput <= 21) {
			System.out.println("Youth is a wonderful thing. Enjoy.");
		}
		
		System.out.println("Age is a state of mind.");
		
		scnr.close();
	}

}
