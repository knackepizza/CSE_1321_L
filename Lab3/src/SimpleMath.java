/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 3
*/

// Importing Scanner
import java.util.Scanner;

public class SimpleMath {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner scnr = new Scanner(System.in);
		
		// Creating r and t as floats, because the Lab demands it
		float r, t;
		
		// Asking the user for their R and T values
		System.out.print("Enter your R value: ");
		r = scnr.nextFloat();
		
		System.out.print("Enter your T value: ");
		t = scnr.nextFloat();
		
		// Outputting the R and T values
		System.out.println("\nR = " + r);
		System.out.println("T = " + t);
		
		// Outputting the math
		System.out.println("R + T = " + (r + t));
		System.out.println("R - T = " + (r - t));
		System.out.println("R * T = " + (r * t));
		
		// Closing the scanner object. Professor talked about it, so I guess its okay to do this now.
		scnr.close();
	}

}
