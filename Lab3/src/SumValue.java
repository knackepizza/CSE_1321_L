/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 3
*/

// Importing the scanner
import java.util.Scanner;

public class SumValue {

	public static void main(String[] args) {
		// Creating scanner obj
		Scanner scnr = new Scanner(System.in);
		
		// Declaring x y and z as int because they are whole numbers
		int x, y, z;
		
		// Declaring the average as a float because it will be a decimal
		double avg;
		
		// Taking the users input
		System.out.print("Tell me your X Value: ");
		x = scnr.nextInt();
		
		System.out.print("Tell me your Y Value: ");
		y = scnr.nextInt();
		
		System.out.print("Tell me your Z Value: ");
		z = scnr.nextInt();
		
		// Outputting the x y and z vars
		System.out.println("\nX = " + x);
		System.out.println("Y = " + y);
		System.out.println("Z = " + z);
		
		// Keeping the avg a float by using itself in division.
		avg = ((x + y + z) / 3.0);
		
		// Outputting the average
		System.out.println("Average = " + avg);
		
		// Closing the scanner object. Professor talked about it, so I guess its okay to do this now.
		scnr.close();
	}

}
