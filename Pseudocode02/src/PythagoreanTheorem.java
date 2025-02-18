/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 3.5 (Assignment 2)
*/

import java.util.Scanner; 
public class PythagoreanTheorem {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int a, b;
		double c;

		System.out.print("What is side A's length? ");
		a = scnr.nextInt();
		
		System.out.print("What is side B's length? ");
		b = scnr.nextInt();
		
		c = Math.sqrt((a * a) + (b * b));
		System.out.println("Hypotenuse is: " + c);
		
		scnr.close();
	}

}
