/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class ProcessGrades {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userInput, highestGrade = 0, lowestGrade = 100;
		int[] listGrades = new int[4];
		float averageGrade = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter your grade: ");
			userInput = scnr.nextInt();
			
			if (userInput > highestGrade) {
				highestGrade = userInput;
				// System.out.println("Highest grade is now: " + highestGrade);
			} 
			
			if (userInput < lowestGrade) {
				lowestGrade = userInput;
				// System.out.println("Lowest grade is now: " + lowestGrade);
			}
			
			averageGrade += userInput;
			// System.out.println("Average grade is now: " + averageGrade);
			
			listGrades[i] = userInput;
		}
		averageGrade /= 4;
		for (int num : listGrades) {
			System.out.println(num);
		}
		System.out.println("Average grade FINAL is: " + averageGrade);
		System.out.println("Highest grade FINAL is: " + highestGrade);
		System.out.println("Lowest grade FINAL is: " + lowestGrade);

		scnr.close();
	}

}
