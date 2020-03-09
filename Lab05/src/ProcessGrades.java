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
		
		int g1, g2, g3, g4, high, low;
		double averageGrade = 0;
		
		System.out.print("Enter your first grade: ");
		g1 = scnr.nextInt();
		System.out.print("Enter your second grade: ");
		g2 = scnr.nextInt();
		System.out.print("Enter your third grade: ");
		g3 = scnr.nextInt();
		System.out.print("Enter your fourth grade: ");
		g4 = scnr.nextInt();
		
		high = Math.max(Math.max(g1, g2), Math.max(g3, g4));
		low = Math.min(Math.min(g1, g2), Math.min(g3, g4));
		averageGrade = (g1 + g2 + g3 + g4) / 4.0;
		
		System.out.println("Highest grade is: " + high);
		System.out.println("Lowest grade is: " + low);
		System.out.println("Average grade is: " + averageGrade);

		scnr.close();
	}

}
