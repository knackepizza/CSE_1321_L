/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		float test1, test2, test3, test4, avgQuiz, attendance;
		double finalGrade;
		
		System.out.print("Please enter your grade for Test 1: ");
		test1 = scnr.nextFloat();
		
		System.out.print("Please enter your grade for Test 2: ");
		test2 = scnr.nextFloat();

		System.out.print("Please enter your grade for Test 3: ");
		test3 = scnr.nextFloat();
		
		System.out.print("Please enter your grade for Test 4: ");
		test4 = scnr.nextFloat();
		
		System.out.print("Please enter your average quiz grade: ");
		avgQuiz = scnr.nextFloat();
		
		System.out.print("Enter the amount of times you attended class (max 30): ");
		attendance = scnr.nextFloat();
		
		finalGrade = (((test1 + test2 + test3 + test4 + avgQuiz) / 5) + ((attendance / 30) * 1.5));
		
		System.out.print("Your average before attendance is: ");
		System.out.printf("%.1f%n", ((test1 + test2 + test3 + test4 + avgQuiz) / 5));
		System.out.print("You receive an additional ");
		System.out.printf("%.2f", ((attendance / 30) * 1.5));
		System.out.println(" points for attendance.");
		System.out.print("Your final grade is ");
		System.out.printf("%.2f", finalGrade);
		System.out.println(".");
		
		scnr.close();
	}

}
