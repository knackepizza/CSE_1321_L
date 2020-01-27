/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 3
*/

// Importing scanner
import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner scnr = new Scanner(System.in);
		
		// Creating all cent types, dollars, and cents total as double to keep decimal values
		int q, d, n, p, dollars, cents;
		
		// Asking user for all cent types and storing in respective values
		System.out.print("Enter number of quarters: ");
		q = scnr.nextInt();
		
		System.out.print("Enter number of dimes: ");
		d = scnr.nextInt();
		
		System.out.print("Enter number of nickels: ");
		n = scnr.nextInt();
		
		System.out.print("Enter number of pennies: ");
		p = scnr.nextInt();
		
		// Outputting cent values, but casted with int to drop the decimal point
		System.out.println("\nYou entered " + q + " quarters");
		System.out.println("You entered " + d + " dimes");
		System.out.println("You entered " + n + " nickels");
		System.out.println("You entered " + p + " pennies");
		
		// Multiplying cents to their respective values
		q *= 25;
		d *= 10;
		n *= 5;
		p *= 1;
		
		// Dollars will be equal to the ones value (X.##)
		dollars = ((q + d + n + p) / 100);

		// Cents is equal to the remainder of 100
		cents = ((q + d + n + p) % 100);
		
		// Printing dollar and cent values casted with int to drop decimal value
		System.out.print("\nYour total is " + dollars + " Dollars and " + cents + " Cents");
		
		// Closing the scanner object. Professor talked about it, so I guess its okay to do this now.
		scnr.close();
	}

}
