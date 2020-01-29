/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 4
*/

import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int grade;
		
		System.out.print("Enter your grade: ");
		grade = scnr.nextInt();
		
		System.out.println("You entered " + grade);
		
		switch (grade/10) {
			case 10:
				System.out.println("That grade is a perfect score. Well done.");
				break;
			case 9:
				System.out.println("That grade is well above average. Excellent work.");
				break;
			case 8:
				System.out.println("That grade is above average. Nice job.");
				break;
			case 7:
				System.out.println("That grade is average work.");
				break;
			case 6:
				System.out.println("That grade is not good, you should seek help!");
				break;
			default:
				System.out.println("That grade is not passing.");
				break;
		}
		
		scnr.close();
	}

}
