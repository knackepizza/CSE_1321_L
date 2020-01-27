/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int grade;
		
		System.out.println("Enter your grade: ");
		grade = scnr.nextInt();
		
		System.out.println("You entered " + grade);
		
		if (grade >= 100) {
			System.out.println("That grade is a perfect score. Well done.");
		} else if (grade >= 90) {
			System.out.println("That grade is well above average. Excellent work.");
		} else if (grade >= 80) {
			System.out.println("That grade is above average. Nice job.");
		} else if (grade >= 70) {
			System.out.println("That grade is average work.");
		} else if (grade >= 60) {
			System.out.println("That grade is not good, you should seek help!");
		} else {
			System.out.println("That grade is not passing.");
		}
		
		scnr.close();
	}

}
