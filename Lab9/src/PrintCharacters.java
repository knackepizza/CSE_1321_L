/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class PrintCharacters {

	static void printChars(char ch1, char ch2) {
		// ASCII Integer value of Char 1 and Char 2.
		int ch1Val = ch1;
		int ch2Val = ch2;
		
		// Rows is equal to the remainder of ch2Val-ch1Val to get how many rows of 5 that difference can make, plus 1.
		// There is a plus one so differences like A to B will still get printed.
		int rows = ((ch2Val - ch1Val) / 5) + 1;
		
		// This is to count how many characters we still have to print.
		int charsLeft = (ch2Val - ch1Val) + 1;
		
		// This is responsible for keeping track of the progress from ch1 to ch2 we are
		int k = 0;
		
		// If there are no rows to show because the chars are out of order, throw an error
		if ((ch2Val - ch1Val) <= 0) {
			System.out.println("Start and End characters are out of order. Try again.");
		} else {
			// So this prints a new row for how many rows necessary
			for (int i = 1; i <= rows; i++) {
				// This prints 5 chars in each row
				for (int j = 1; j <= 5; j++) {
					// If there are no chars to display, it will stop printing chars in that row
					if (charsLeft != 0) {
						// char3, the current char we want to print, is the lowest charValue + k (the progress between char1 and char2)
						char char3 = (char) (ch1Val + k);
						System.out.print(char3 + " ");
						
						// Increase the progress between char1 and char2 so we keep moving forward
						k++;
						
						// Decrease the amount of chars we have left to print
						charsLeft--;
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		char ch1, ch2;
		
		// Take in user input
		System.out.print("Start character: ");
		ch1 = scnr.next().charAt(0);

		System.out.print("End character: ");
		ch2 = scnr.next().charAt(0);
		
		// Print it out using the method printChars()
		printChars(ch1, ch2);
		
		scnr.close();
	}

}
