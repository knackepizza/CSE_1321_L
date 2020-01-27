/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class PrintSum {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userInput, sum = 0;
		
		System.out.print("Enter a number: ");
		userInput = scnr.nextInt();
		while (userInput < 0 || userInput > 100) {
			System.out.println("Invalid Input. Try again.");
			userInput = scnr.nextInt();
		}
		
		System.out.println("You entered: " + userInput);
		
		for (int i = 1; i <= userInput; i++) {
			sum += i;
		}
		
		System.out.println("Sum of values: " + sum);

		scnr.close();
	}
}
