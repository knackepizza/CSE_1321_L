/* Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 4
*/

import java.util.Scanner;

public class WeeklyPay {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int hours, overtime;
		double rate = 10.0, total;
		
		System.out.print("Enter your hours: ");
		hours = scnr.nextInt();

		System.out.println("You entered " + hours + " hours.");
		
		overtime = (hours - 40);

		if (overtime > 0) {
			hours = (hours - overtime);
		} else {
			overtime = 0;
		} 
		
		total = ((hours * rate) + (overtime * (rate *1.5)));
		System.out.println("Gross earning is $" + (total));
		
		scnr.close();
	}

}
